package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityAlmiraj;
import imnotjahan.mod.danmachi.entity.EntityMinotaur;
import imnotjahan.mod.danmachi.entity.model.ModelAlmiraj;
import imnotjahan.mod.danmachi.entity.model.ModelMinotaur;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMinotaur extends RenderLiving<EntityMinotaur>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/minotaur.png");

    public RenderMinotaur(RenderManager manager)
    {
        super(manager, new ModelMinotaur(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityMinotaur entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityMinotaur entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
