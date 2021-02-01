package imnotjahan.mod.danmachi.objects.tools;

import com.google.common.collect.Multimap;
import imnotjahan.mod.danmachi.Main;
import imnotjahan.mod.danmachi.init.BlockInit;
import imnotjahan.mod.danmachi.init.ItemInit;
import imnotjahan.mod.danmachi.util.interfaces.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ToolSword extends ItemSword implements IHasModel
{
    private float customAttackSpeed = 0;
    private String name = "";

    public ToolSword(String name, ToolMaterial material, float attackSpeed)
    {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.creativeTab);

        ItemInit.ITEMS.add(this);

        customAttackSpeed = attackSpeed;

        this.name = name;
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

        if (slot == EntityEquipmentSlot.MAINHAND && customAttackSpeed != 0)
        {
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, customAttackSpeed);
        }

        return modifiers;
    }

    private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id, double multiplier) {
        final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());

        final Optional<AttributeModifier> modifierOptional = modifiers.stream().filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();

        if (modifierOptional.isPresent())
        {
            final AttributeModifier modifier = modifierOptional.get();
            modifiers.remove(modifier);
            modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), modifier.getAmount() * multiplier, modifier.getOperation()));
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        switch(name)
        {
            case "hakugen":
                tooltip.add("Right click to stab yourself");
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        switch(name)
        {
            case "hakugen":
                if(playerIn.isPotionActive(Potion.getPotionById(19)))
                {
                    playerIn.removePotionEffect(Potion.getPotionById(19));
                }

                if(playerIn.isPotionActive(Potion.getPotionById(20)))
                {
                    playerIn.removePotionEffect(Potion.getPotionById(20));
                }

                playerIn.setHealth(playerIn.getHealth() - 5);
                playerIn.performHurtAnimation();
                break;
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
    {
        EntityPlayer entityplayer = entityLiving instanceof EntityPlayer ? (EntityPlayer)entityLiving : null;

        switch(name)
        {
            case "fire_magic_sword":
                placeMagicSwordBlocks(entityLiving, BlockInit.RAGING_INFERNO.getDefaultState());
                break;

            case "ice_magic_sword":
                placeMagicSwordBlocks(entityLiving, Blocks.ICE.getDefaultState());
                break;
        }

        if((name == "ice_magic_sword" || name == "fire_magic_sword") && !entityplayer.capabilities.isCreativeMode)
        {
            setDamage(stack,getDamage(stack) + 1);

            if(getDamage(stack) > 2)
            {
                stack.setCount(0);
            }
        }

        return super.onEntitySwing(entityLiving, stack);
    }
    
    private void placeMagicSwordBlocks(EntityLivingBase entityLiving, IBlockState block)
    {
        for(int k = 0; k < 15; k++)
        {
            for(int j = 0; j < k; j++)
            {
                for(int i = 0; i < k; i++)
                {
                    BlockPos blockPos = entityLiving.getPosition().offset(entityLiving.getHorizontalFacing(), k + 2)
                            .offset(entityLiving.getHorizontalFacing().rotateAround(EnumFacing.Axis.Y), j)
                            .offset(EnumFacing.UP, i);

                    if(canPlaceFire(entityLiving.world, blockPos) && airNotUnder(entityLiving.world, blockPos.offset(EnumFacing.DOWN, 1)))
                    {
                        entityLiving.world.setBlockState(blockPos, block);
                    }

                    blockPos = entityLiving.getPosition().offset(entityLiving.getHorizontalFacing(), k + 2)
                            .offset(entityLiving.getHorizontalFacing().rotateAround(EnumFacing.Axis.Y), -j)
                            .offset(EnumFacing.UP, i);

                    if(canPlaceFire(entityLiving.world, blockPos) && airNotUnder(entityLiving.world, blockPos.offset(EnumFacing.DOWN, 1)))
                    {
                        entityLiving.world.setBlockState(blockPos, block);
                    }
                }
            }
        }
    }

    private boolean airNotUnder(World world, BlockPos blockPos)
    {
        return world.getBlockState(blockPos) != Blocks.AIR &&
                world.getBlockState(blockPos) != Blocks.ICE.getDefaultState() &&
                world.getBlockState(blockPos) != BlockInit.RAGING_INFERNO.getDefaultState();
    }

    private boolean canPlaceFire(World world, BlockPos blockPos)
    {
        return world.getBlockState(blockPos) == Blocks.AIR ||
                world.getBlockState(blockPos) == Blocks.GRASS.getDefaultState() ||
                world.getBlockState(blockPos) == Blocks.TALLGRASS.getDefaultState() ||
                world.getBlockState(blockPos) == Blocks.YELLOW_FLOWER.getDefaultState() ||
                world.getBlockState(blockPos) == Blocks.RED_FLOWER.getDefaultState() ||
                world.getBlockState(blockPos) == Blocks.DOUBLE_PLANT.getDefaultState();
    }
}