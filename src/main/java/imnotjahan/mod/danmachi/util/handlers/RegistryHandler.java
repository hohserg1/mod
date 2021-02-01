package imnotjahan.mod.danmachi.util.handlers;

import imnotjahan.mod.danmachi.init.BlockInit;
import imnotjahan.mod.danmachi.init.EnchantmentInit;
import imnotjahan.mod.danmachi.init.EntityInit;
import imnotjahan.mod.danmachi.init.ItemInit;
import imnotjahan.mod.danmachi.util.interfaces.IHasModel;
import imnotjahan.mod.danmachi.world.gen.GenerateOres;
import imnotjahan.mod.danmachi.world.gen.WorldGenCustomStructures;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onEnchantRegister(RegistryEvent.Register<Enchantment> event)
    {
        event.getRegistry().registerAll(EnchantmentInit.ENCHANTMENTS.toArray(new Enchantment[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : BlockInit.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }
        }
    }

    public static void preInitRegistries()
    {
        GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);

        EntityInit.RegisterEntities();
        RenderHandler.registerEntityRenderers();
        RecipeHandler.registerSmelting();
    }

    public static void otherRegistries()
    {
        GameRegistry.registerWorldGenerator(new GenerateOres(), 0);
    }

    public static void initRegistries()
    {
        RecipeHandler.registerSmelting();
        SoundHandler.registerSounds();
    }
}
