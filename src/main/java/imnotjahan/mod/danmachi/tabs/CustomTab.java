package imnotjahan.mod.danmachi.tabs;

import imnotjahan.mod.danmachi.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomTab extends CreativeTabs
{
    public CustomTab(String label)
    {
        super("danmachitab");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.HESTIA_KNIFE);
    }
}
