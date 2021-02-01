package imnotjahan.mod.danmachi.enchantments;

import imnotjahan.mod.danmachi.init.EnchantmentInit;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;

public class DurandalEnchantment extends Enchantment
{
    public DurandalEnchantment()
    {
        super(Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND});

        this.setName("durandal");
        this.setRegistryName(new ResourceLocation(Reference.MODID + ":durandal"));

        EnchantmentInit.ENCHANTMENTS.add(this);
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 30;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return 50;
    }

    @Override
    public int getMaxLevel()
    {
        return 1;
    }

    @Override
    protected boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench) && ench != Enchantments.UNBREAKING;
    }

    @Override
    public void onEntityDamaged(EntityLivingBase user, Entity target, int level)
    {
        user.getHeldItem(EnumHand.MAIN_HAND).setItemDamage(0);
    }
}
