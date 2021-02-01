package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityAlmiraj;
import imnotjahan.mod.danmachi.entity.EntityNeedleRabbit;
import imnotjahan.mod.danmachi.entity.model.ModelAlmiraj;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNeedleRabbit extends RenderLiving<EntityNeedleRabbit>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/almiraj.png");

    public RenderNeedleRabbit(RenderManager manager)
    {
        super(manager, new ModelAlmiraj(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityNeedleRabbit entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityNeedleRabbit entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
