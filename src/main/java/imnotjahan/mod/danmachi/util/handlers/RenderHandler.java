package imnotjahan.mod.danmachi.util.handlers;

import imnotjahan.mod.danmachi.entity.*;
import imnotjahan.mod.danmachi.entity.render.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
    public static void registerEntityRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityGoblin.class, manager -> new RenderGoblin(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityKobold.class, manager -> new RenderKobold(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityUnicorn.class, manager -> new RenderUnicorn(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityAlmiraj.class, manager -> new RenderAlmiraj(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityMinotaur.class, manager -> new RenderMinotaur(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityNeedleRabbit.class, manager -> new RenderNeedleRabbit(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityLygerfang.class, manager -> new RenderLygerfang(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityKillerAnt.class, manager -> new RenderKillerAnt(manager));

        RenderingRegistry.registerEntityRenderingHandler(EntityGod.class, manager -> new RenderGod(manager));
    }
}
