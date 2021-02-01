package imnotjahan.mod.danmachi.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelKobold extends ModelBase {
    public ModelRenderer rightArm;
    public ModelRenderer rightLeg;
    public ModelRenderer chest;
    public ModelRenderer leftArm;
    public ModelRenderer leftLeg;
    public ModelRenderer nose;
    public ModelRenderer head;
    public ModelRenderer rightEar;
    public ModelRenderer leftEar;

    public ModelKobold() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.nose = new ModelRenderer(this, 0, 10);
        this.nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nose.addBox(-1.5F, -3.0F, -6.0F, 3, 3, 4, 0.0F);
        this.chest = new ModelRenderer(this, 16, 16);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addBox(-3.0F, 0.0F, -2.0F, 6, 10, 4, 0.0F);
        this.rightEar = new ModelRenderer(this, 16, 14);
        this.rightEar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightEar.addBox(2.0F, -8.0F, 0.0F, 2, 2, 1, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-3.0F, -6.0F, -2.0F, 6, 6, 4, 0.0F);
        this.leftArm = new ModelRenderer(this, 40, 16);
        this.leftArm.mirror = true;
        this.leftArm.setRotationPoint(4.0F, 2.0F, 0.0F);
        this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 3, 0.0F);
        this.setRotateAngle(leftArm, -1.3962634015954636F, 0.10000736613927509F, -0.10000736613927509F);
        this.rightLeg = new ModelRenderer(this, 0, 16);
        this.rightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.rightLeg.addBox(-1.0F, -2.0F, -2.0F, 3, 10, 4, 0.0F);
        this.leftEar = new ModelRenderer(this, 16, 14);
        this.leftEar.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftEar.addBox(1.0F, -8.0F, 0.0F, 2, 2, 1, 0.0F);
        this.leftLeg = new ModelRenderer(this, 0, 16);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.leftLeg.addBox(-2.0F, -2.0F, -2.0F, 3, 10, 4, 0.0F);
        this.rightArm = new ModelRenderer(this, 40, 16);
        this.rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 3, 0.0F);
        this.setRotateAngle(rightArm, -1.3962634015954636F, -0.10000736613927509F, 0.10000736613927509F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.nose.render(f5);
        this.chest.render(f5);
        this.rightEar.render(f5);
        this.head.render(f5);
        this.leftArm.render(f5);
        this.rightLeg.render(f5);
        this.leftEar.render(f5);
        this.leftLeg.render(f5);
        this.rightArm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;

        this.rightEar.rotateAngleY = netHeadYaw * 0.017453292F;
        this.rightEar.rotateAngleX = headPitch * 0.017453292F;
        this.leftEar.rotateAngleY = netHeadYaw * 0.017453292F;
        this.leftEar.rotateAngleX = headPitch * 0.017453292F;

        this.nose.rotateAngleY = netHeadYaw * 0.017453292F;
        this.nose.rotateAngleX = headPitch * 0.017453292F;
    }
}
