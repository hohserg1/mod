package imnotjahan.mod.danmachi.gui;

import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ConfigGUI extends GuiConfig
{
    public ConfigGUI(GuiScreen parent)
    {
        super(parent, Reference.MODID, "Danmachi Config");
    }

    @Override
    public void initGui()
    {
        super.initGui();
    }


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        super.actionPerformed(button);
    }
}
