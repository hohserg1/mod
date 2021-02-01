package imnotjahan.mod.danmachi.gui;

import imnotjahan.mod.danmachi.capabilities.IStatus;
import imnotjahan.mod.danmachi.capabilities.Status;
import imnotjahan.mod.danmachi.capabilities.StatusProvider;
import imnotjahan.mod.danmachi.init.ItemInit;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@SideOnly(Side.CLIENT)
public class GodGUI extends GuiScreen
{
    private GuiLabel godDialog;

    String[] agressiveGreetings = { "What do you want?" };
    String[] answers = { "I suppose", "Sure", "Hmmm okay" };

    String godName;
    boolean hasBottle;

    IStatus status;

    @Override
    public void initGui()
    {
        refreshGui();

        String[] happyGreetings = { "Hi!", "Ah if it isn't " + mc.player.getName() };

        status = mc.player.getCapability(StatusProvider.STATUS_CAP, Status.capSide);

        String familia = status.getFamilia();

        if(familia == "")
        {
            godDialog.addLine(getRandom(agressiveGreetings));
            addButtons(new String[]{"Can I join your familia?", "Nothing"});
        }
        else if(familia == godName)
        {
            godDialog.addLine(getRandom(happyGreetings));

            if(hasBottle)
            {
                addButtons(new String[]{"Can I take some of your blood?", "Can you update my status", "Nothing"});
            } else
            {
                addButtons(new String[]{"Can you update my status", "Nothing"});
            }
        } else
        {
            godDialog.addLine("Ah what would a child of " + familia + " need from me");
            addButtons(new String[]{"Nothing"});
        }
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        refreshGui();

        switch(button.displayString)
        {
            case "Can I join your familia?":
                godDialog.addLine(getRandom(answers));
                godDialog.addLine("Give me a second and I'll give you a falna");

                addButtons(new String[]{"Ok"});
                break;

            case "Nothing":
            case "Got it":
            case "Thanks":
            case "Nevermind":
                mc.displayGuiScreen(null);
                break;

            case "Ok":
                godDialog.addLine("Anddd finished");

                status.giveFalna();
                status.setFamilia(godName);

                addButtons(new String[]{"Thanks"});
                break;

            case "Okay":
                if(status.get(6) != status.getLevel())
                {
                    godDialog.addLine("You've leveled up!");
                    addButtons(new String[]{"Finally"});
                } else
                {
                    godDialog.addLine("Andd your status is now updated");
                    addButtons(new String[]{"Thanks"});
                }
                break;

            case "Can you update my status":
                godDialog.addLine("Sure thing, just give me one second");
                addButtons(new String[]{"Okay"});
                break;

            case "Can I take some of your blood?":
                godDialog.addLine("Excuse me?");
                addButtons(new String[]{"It's for a weapon", "Nevermind"});
                break;

            case "It's for a weapon":
                godDialog.addLine("Oh ok...");
                godDialog.addLine("Well here, don't do anything weird with it though");
                addButtons(new String[]{"Thanks"});
                mc.player.inventory.setInventorySlotContents(mc.player.inventory.currentItem, new ItemStack(ItemInit.ICHOR));
                break;
        }
    }

    private static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        this.drawDefaultBackground();

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return true;
    }

    private void refreshGui()
    {
        buttonList.clear();
        labelList.clear();

        this.labelList.add(godDialog = new GuiLabel(fontRenderer, 1, this.width / 2, 50, 0, 20, 0xFFFFFF));

        godDialog.setCentered();
    }

    public GodGUI(String godName, boolean flag)
    {
        this.godName = godName;
        this.hasBottle = flag;
    }

    private void addButtons(String[] strings)
    {
        for(int k = 0; k < strings.length; k++)
        {
            buttonList.add(new GuiButton(k, this.width / 2 - 100, 100 + 30 * k, strings[k]));
        }
    }
}