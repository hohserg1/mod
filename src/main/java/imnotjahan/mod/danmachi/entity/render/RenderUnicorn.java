package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityUnicorn;
import imnotjahan.mod.danmachi.entity.model.ModelUnicorn;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUnicorn extends RenderLiving<EntityUnicorn>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/unicorn.png");

    public RenderUnicorn(RenderManager manager)
    {
        super(manager, new ModelUnicorn(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityUnicorn entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityUnicorn entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
