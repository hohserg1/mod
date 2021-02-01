package imnotjahan.mod.danmachi.config;

import imnotjahan.mod.danmachi.util.Reference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.*;

@Config(modid = Reference.MODID)
public class ModConfig
{
    @Config.Name("Drop magic crystals")
    public static boolean dropMagicCrystals = true;

    @Config.Comment("Adds familia name to crafted items")
    @Config.Name("Familia seal")
    public static boolean familiaSeal = false;

    @Config.Comment("The order of stat increases is: strength, endurance, dextarity, agility, magic, excelia")
    @Config.Name("Mob stat increases")
    public static Map<String, int[]> statusIncreases = new HashMap<String, int[]>(){{
        put("goblin", new int[]{2, 2, 1, 1, 0, 2});
        put("kobold", new int[]{2, 2, 1, 2, 0, 2});
        put("killer_ant", new int[]{2, 3, 4, 1, 0, 3});
        put("needle_rabbit", new int[]{2, 3, 1, 4, 0, 2});
        put("almiraj", new int[]{2, 2, 3, 5, 0, 3});
        put("lygerfang", new int[]{2, 3, 2, 5, 0, 4});
        put("minotaur", new int[]{6, 6, 2, 4, 0, 6});
        put("unicorn", new int[]{4, 4, 2, 6, 0, 6});
    }};

    @Config.Name("Guide book text")
    @Config.Comment({"Every entry is a page", "To add text breaks type \"\\n\""})
    public static String[] guideBookText = new String[]{"I don't know what to put in this", "If anyone knows what I should write in this please tell me on discord ImNotJahan#3737"};

    @Config.RequiresMcRestart
    @Config.Name("Mob spawn rates")
    @Config.Comment("They can go from 100 to 0")
    public static Map<String, Integer> spawnRates = new HashMap<String, Integer>(){{
        put("goblin", 50);
        put("kobold", 50);
        put("killer_ant", 10);
        put("needle_rabbit", 10);
        put("almiraj", 5);
        put("lygerfang", 4);
        put("minotaur", 4);
        put("unicorn", 2);
    }};

    @Config.RequiresWorldRestart
    @Config.Name("Generate god houses")
    public static boolean generateGodHouses = true;

    @Config.RequiresWorldRestart
    @Config.Name("God house generation chance")
    @Config.Comment("The higher the number the less chance of it generating")
    public static int godHouseGenerationChance = 300;

    @Mod.EventBusSubscriber(modid = Reference.MODID)
    private static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(Reference.MODID)) {
                ConfigManager.sync(Reference.MODID, Config.Type.INSTANCE);
            }
        }
    }
}
