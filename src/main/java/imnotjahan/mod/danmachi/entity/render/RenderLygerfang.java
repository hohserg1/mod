package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityLygerfang;
import imnotjahan.mod.danmachi.entity.model.ModelLygerfang;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLygerfang extends RenderLiving<EntityLygerfang>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/lygerfang.png");

    public RenderLygerfang(RenderManager manager)
    {
        super(manager, new ModelLygerfang(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityLygerfang entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityLygerfang entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
