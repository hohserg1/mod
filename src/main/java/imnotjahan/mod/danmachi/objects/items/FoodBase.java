package imnotjahan.mod.danmachi.objects.items;

import imnotjahan.mod.danmachi.Main;
import imnotjahan.mod.danmachi.init.ItemInit;
import imnotjahan.mod.danmachi.util.interfaces.IHasModel;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FoodBase extends ItemFood implements IHasModel
{
    String name;
    boolean drink;

    public FoodBase(String name, int hungerQuench, boolean isWolfFood, boolean drink)
    {
        super(hungerQuench, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.creativeTab);

        if(drink)
        {
            maxStackSize = 1;
        }

        ItemInit.ITEMS.add(this);

        this.name = name;
        this.drink = drink;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if(drink)
        {
            playerIn.setActiveHand(handIn);
            return new ActionResult<>(EnumActionResult.SUCCESS, itemstack);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        EntityPlayer player = entityLiving instanceof EntityPlayer ? (EntityPlayer)entityLiving : null;

        switch(name)
        {
            case "soma":
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 600, 1, false, false));
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 600, 1, false, false));
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(18), 600, 1, false, false));
                break;

            case "mermaid_blood":
                entityLiving.heal(entityLiving.getMaxHealth() / 2);
                break;
        }

        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(this, stack);
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));

            if (entityplayer instanceof EntityPlayerMP)
            {
                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)entityplayer, stack);
            }
        }

        if(player != null)
        {
            if(!player.capabilities.isCreativeMode)
            {
                stack.shrink(1);
            }
        } else
        {
            stack.shrink(1);
        }

        return stack;
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        if(drink)
        {
            return EnumAction.DRINK;
        }

        return EnumAction.EAT;
    }
}
