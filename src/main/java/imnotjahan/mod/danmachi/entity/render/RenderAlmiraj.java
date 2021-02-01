package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityAlmiraj;
import imnotjahan.mod.danmachi.entity.EntityUnicorn;
import imnotjahan.mod.danmachi.entity.model.ModelAlmiraj;
import imnotjahan.mod.danmachi.entity.model.ModelUnicorn;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.model.ModelRabbit;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAlmiraj extends RenderLiving<EntityAlmiraj>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/almiraj.png");

    public RenderAlmiraj(RenderManager manager)
    {
        super(manager, new ModelRabbit(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityAlmiraj entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityAlmiraj entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
