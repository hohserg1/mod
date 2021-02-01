package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityGoblin;
import imnotjahan.mod.danmachi.entity.model.ModelGoblin;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGoblin extends RenderLiving<EntityGoblin>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/goblin.png");

    public RenderGoblin(RenderManager manager)
    {
        super(manager, new ModelGoblin(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityGoblin entity)
    {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityGoblin entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
