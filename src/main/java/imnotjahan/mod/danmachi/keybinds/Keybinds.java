package imnotjahan.mod.danmachi.keybinds;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class Keybinds
{
    public static KeyBinding status;

    public static void RegisterKeybinds()
    {
        status = new KeyBinding("key.status", Keyboard.KEY_V, "key.categories.danmachi");

        ClientRegistry.registerKeyBinding(status);
    }
}
