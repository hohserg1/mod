package imnotjahan.mod.danmachi.init;

import imnotjahan.mod.danmachi.enchantments.DurandalEnchantment;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class EnchantmentInit
{
    public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();

    public static final Enchantment DURANDAL = new DurandalEnchantment();

    @SubscribeEvent
    public static void DurandalEnchant(LivingEvent.LivingUpdateEvent event)
    {
        EntityLivingBase living = event.getEntityLiving();
        int level = EnchantmentHelper.getMaxEnchantmentLevel(DURANDAL, living);
    }
}
