package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityKillerAnt;
import imnotjahan.mod.danmachi.entity.model.ModelKillerAnt;
import imnotjahan.mod.danmachi.entity.model.ModelMinotaur;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKillerAnt extends RenderLiving<EntityKillerAnt>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/killer_ant.png");

    public RenderKillerAnt(RenderManager manager)
    {
        super(manager, new ModelKillerAnt(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityKillerAnt entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityKillerAnt entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
