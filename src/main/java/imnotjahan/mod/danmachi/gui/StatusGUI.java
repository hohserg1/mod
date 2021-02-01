package imnotjahan.mod.danmachi.gui;

import imnotjahan.mod.danmachi.capabilities.IStatus;
import imnotjahan.mod.danmachi.capabilities.Status;
import imnotjahan.mod.danmachi.capabilities.StatusProvider;
import imnotjahan.mod.danmachi.keybinds.Keybinds;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;
import java.util.Collections;

@SideOnly(Side.CLIENT)
public class StatusGUI extends GuiScreen
{

    private static final char[] statLetters = new char[]{'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A', 'S'};

    IStatus capability;

    @Override
    public void initGui()
    {
        GuiLabel statusText;

        this.labelList.clear();
        this.labelList.add(statusText = new GuiLabel(fontRenderer, 1, this.width / 2, this.height / 2, 0, 20, 0xFFFFFF));

        capability = mc.player.getCapability(StatusProvider.STATUS_CAP, Status.capSide);

        int level = capability.getLevel();
        int strength = capability.get(1);
        int endurance = capability.get(2);
        int dexterity = capability.get(3);
        int agility = capability.get(4);
        int magic = capability.get(5);

        if(capability.getFalna())
        {
            statusText.addLine("Level " + level);
            statusText.addLine("Strength: " + getStatLetter(strength) + strength);
            statusText.addLine("Endurance: " + getStatLetter(endurance) + endurance);
            statusText.addLine("Dexterity: " + getStatLetter(dexterity) + dexterity);
            statusText.addLine("Agility: " + getStatLetter(agility) + agility);
            statusText.addLine("Magic: " + getStatLetter(magic) + magic);
        } else
        {
            statusText.addLine("You need to get a falna first");
        }

        statusText.setCentered();
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        String familia = mc.player.getCapability(StatusProvider.STATUS_CAP, Status.capSide).getFamilia();

        drawDefaultBackground();
        
        if(!familia.equals(""))
        {
            mc.getTextureManager().bindTexture(new ResourceLocation(String.format("%s:textures/gui/falnas/%s.png", Reference.MODID, familia)));
            drawModalRectWithCustomSizedTexture(0, 0, 0, 0, width, height, width, height);
        }

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException
    {
        super.keyTyped(typedChar, keyCode);

        if(keyCode == Keybinds.status.getKeyCode())
        {
            this.mc.displayGuiScreen(null);

            if (this.mc.currentScreen == null)
            {
                this.mc.setIngameFocus();
            }
        }
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    private String getStatLetter(int stat)
    {
        int index = (int) Math.floor(stat / 100);
        if (index > 9)
        {
            return String.join("", Collections.nCopies(Math.min(index - 8, 3), "S"));
        } else
        {
            return Character.toString(statLetters[index]);
        }
    }
}