package imnotjahan.mod.danmachi.init;

import imnotjahan.mod.danmachi.Main;
import imnotjahan.mod.danmachi.config.ModConfig;
import imnotjahan.mod.danmachi.entity.*;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
    public static void RegisterEntities()
    {
        Biome[] biomes = new Biome[]{Biome.getBiome(1), Biome.getBiome(2), Biome.getBiome(3), Biome.getBiome(4), Biome.getBiome(5),
                Biome.getBiome(12), Biome.getBiome(13), Biome.getBiome(16), Biome.getBiome(17), Biome.getBiome(18),
                Biome.getBiome(19), Biome.getBiome(20), Biome.getBiome(21), Biome.getBiome(22), Biome.getBiome(21)};

        RegisterEntity("goblin", EntityGoblin.class, Reference.GOBLIN_ID, 100, 32806,9240576);
        RegisterEntity("kobold", EntityKobold.class, Reference.KOBOLD_ID, 100, 9736335,5196618);
        RegisterEntity("killer_ant", EntityKillerAnt.class, Reference.KILLER_ANT, 100, 9520427, 5261118);
        RegisterEntity("needle_rabbit", EntityNeedleRabbit.class, Reference.NEEDLE_RABBIT, 100, 16777215, 11796480);
        RegisterEntity("almiraj", EntityAlmiraj.class, Reference.ALMIRAJ, 100,11796480, 16777215);
        RegisterEntity("minotaur", EntityMinotaur.class, Reference.MINOTAUR, 100, 6968398, 14111828);
        RegisterEntity("lygerfang", EntityLygerfang.class, Reference.LYGERFANG, 100, 12025153, 2761239);
        RegisterEntity("unicorn", EntityUnicorn.class, Reference.UNICORN, 100, 0, 16777215);
        RegisterEntity("god", EntityGod.class, Reference.GOD, 100, 15527148, 4609420);

        EntityRegistry.addSpawn(EntityKobold.class, ModConfig.spawnRates.get("kobold"), 0, 10, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn(EntityGoblin.class, ModConfig.spawnRates.get("goblin"), 0, 10, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn(EntityUnicorn.class, ModConfig.spawnRates.get("unicorn"), 0, 10, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn(EntityAlmiraj.class, ModConfig.spawnRates.get("almiraj"), 0, 10, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn(EntityNeedleRabbit.class, ModConfig.spawnRates.get("needle_rabbit"), 0, 10, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn(EntityKillerAnt.class, ModConfig.spawnRates.get("killer_ant"), 0, 10, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn(EntityMinotaur.class, ModConfig.spawnRates.get("minotaur"), 0, 10, EnumCreatureType.MONSTER, biomes);
        EntityRegistry.addSpawn(EntityLygerfang.class, ModConfig.spawnRates.get("lygerfang"), 0, 10, EnumCreatureType.MONSTER, biomes);
    }

    private static void RegisterEntity(String name, Class<?extends Entity> entity, int id, int range, int color, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color, color2);
    }
}
