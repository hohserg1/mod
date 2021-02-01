package imnotjahan.mod.danmachi.entity.render;

import imnotjahan.mod.danmachi.entity.EntityGod;
import imnotjahan.mod.danmachi.entity.model.ModelLygerfang;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderVillager;
import net.minecraft.util.ResourceLocation;

public class RenderGod extends RenderLiving<EntityGod>
{
    public RenderGod(RenderManager manager)
    {
        super(manager, new ModelPlayer(0, false), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityGod entity)
    {
        return new ResourceLocation(Reference.MODID + ":textures/entity/hestia.png");

    }

    @Override
    protected void applyRotations(EntityGod entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
