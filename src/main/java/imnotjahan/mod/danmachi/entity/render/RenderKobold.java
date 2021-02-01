package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityKobold;
import imnotjahan.mod.danmachi.entity.model.ModelKobold;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKobold extends RenderLiving<EntityKobold>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/kobold.png");

    public RenderKobold(RenderManager manager)
    {
        super(manager, new ModelKobold(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityKobold entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityKobold entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
