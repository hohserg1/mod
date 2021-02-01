package imnotjahan.mod.danmachi;

import imnotjahan.mod.danmachi.command.CommandGet;
import imnotjahan.mod.danmachi.command.CommandSet;
import imnotjahan.mod.danmachi.keybinds.KeyInputHandler;
import imnotjahan.mod.danmachi.keybinds.Keybinds;
import imnotjahan.mod.danmachi.proxy.CommonProxy;
import imnotjahan.mod.danmachi.tabs.CustomTab;
import imnotjahan.mod.danmachi.util.Reference;
import imnotjahan.mod.danmachi.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = Reference.MODID,
        name = Reference.NAME,
        version = Reference.VERSION,
        useMetadata = true,
        guiFactory = Reference.GUI_FACTORY)
public class Main {
    public static final CreativeTabs creativeTab = new CustomTab("danmachitab");

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
        RegistryHandler.otherRegistries();
        Keybinds.RegisterKeybinds();

        MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init();
        RegistryHandler.initRegistries();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void serverStart(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandGet());
        event.registerServerCommand(new CommandSet());
    }
}
