package imnotjahan.mod.danmachi.util.handlers;

import imnotjahan.mod.danmachi.init.BlockInit;
import imnotjahan.mod.danmachi.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler
{
    public static void registerSmelting()
    {
        GameRegistry.addSmelting(new ItemStack(BlockInit.ORICHALCUM_ORE,1 ,0), new ItemStack(ItemInit.ORICHALCUM_INGOT, 1), 1.0f);
        GameRegistry.addSmelting(new ItemStack(BlockInit.ADAMANTITE_ORE,1 ,0), new ItemStack(ItemInit.ADAMANTITE_INGOT, 1), 1.0f);
        GameRegistry.addSmelting(new ItemStack(BlockInit.MYTHRIL_ORE,1 ,0), new ItemStack(ItemInit.MYTHRIL_INGOT, 1), 1.0f);
    }
}
