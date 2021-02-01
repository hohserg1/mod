package imnotjahan.mod.danmachi.util.handlers;

import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler
{
    public static SoundEvent ENTITY_MINOTAUR_HURT;
    public static SoundEvent ENTITY_MINOTAUR_DEATH;
    public static SoundEvent ENTITY_MINOTAUR_AMBIENT;

    public static SoundEvent ENTITY_LYGERFANG_AMBIENT;
    public static SoundEvent ENTITY_LYGERFANG_HURT;
    public static SoundEvent ENTITY_LYGERFANG_DEATH;

    public static void registerSounds()
    {
        ENTITY_MINOTAUR_DEATH = registerSound("entity.minotaur.death");
        ENTITY_MINOTAUR_HURT = registerSound("entity.minotaur.hurt");
        ENTITY_MINOTAUR_AMBIENT = registerSound("entity.minotaur.ambient");

        ENTITY_LYGERFANG_AMBIENT = registerSound("entity.lygerfang.ambient");
        ENTITY_LYGERFANG_HURT = registerSound("entity.lygerfang.hurt");
        ENTITY_LYGERFANG_DEATH = registerSound("entity.lygerfang.death");
    }

    private static SoundEvent registerSound(String name)
    {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);

        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);

        return event;
    }
}
