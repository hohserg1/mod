package imnotjahan.mod.danmachi.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelMinotaur extends ModelBase {
    public ModelRenderer rightArm;
    public ModelRenderer rightLeg;
    public ModelRenderer head;
    public ModelRenderer chest;
    public ModelRenderer leftArm;
    public ModelRenderer leftLeg;
    public ModelRenderer leftHornBase;
    public ModelRenderer leftHornTip;
    public ModelRenderer rightHornBase;
    public ModelRenderer rightHornTip;
    public ModelRenderer nose;

    public ModelMinotaur() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rightLeg = new ModelRenderer(this, 0, 16);
        this.rightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.nose = new ModelRenderer(this, 56, 0);
        this.nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nose.addBox(-2.0F, -4.0F, -6.0F, 4, 4, 2, 0.0F);
        this.chest = new ModelRenderer(this, 16, 16);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.head = new ModelRenderer(this, 2, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.leftArm = new ModelRenderer(this, 32, 48);
        this.leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightArm = new ModelRenderer(this, 40, 16);
        this.rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightHornTip = new ModelRenderer(this, 0, 0);
        this.rightHornTip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHornTip.addBox(-8.0F, -7.0F, -5.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rightHornTip, 0.0F, -0.17453292519943295F, 0.0F);
        this.leftHornTip = new ModelRenderer(this, 0, 0);
        this.leftHornTip.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHornTip.addBox(7.0F, -7.0F, -5.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(leftHornTip, 0.0F, 0.17453292519943295F, 0.0F);
        this.rightHornBase = new ModelRenderer(this, 0, 0);
        this.rightHornBase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHornBase.addBox(-8.0F, -7.0F, -2.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(rightHornBase, 0.0F, -0.17453292519943295F, 0.0F);
        this.leftLeg = new ModelRenderer(this, 16, 48);
        this.leftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.leftHornBase = new ModelRenderer(this, 40, 0);
        this.leftHornBase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHornBase.addBox(4.0F, -7.0F, -2.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(leftHornBase, 0.0F, 0.17453292519943295F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.rightLeg.render(f5);
        this.nose.render(f5);
        this.chest.render(f5);
        this.head.render(f5);
        this.leftArm.render(f5);
        this.rightArm.render(f5);
        this.rightHornTip.render(f5);
        this.leftHornTip.render(f5);
        this.rightHornBase.render(f5);
        this.leftLeg.render(f5);
        this.leftHornBase.render(f5);
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
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netchestYaw, float chestPitch, float scaleFactor, Entity entityIn)
    {
        this.head.rotateAngleY = netchestYaw * 0.017453292F;
        this.head.rotateAngleX = chestPitch * 0.017453292F;

        this.leftHornBase.rotateAngleY = netchestYaw * 0.017453292F;
        this.leftHornBase.rotateAngleX = chestPitch * 0.017453292F;
        this.leftHornTip.rotateAngleY = netchestYaw * 0.017453292F;
        this.leftHornTip.rotateAngleX = chestPitch * 0.017453292F;

        this.rightHornBase.rotateAngleY = netchestYaw * 0.017453292F;
        this.rightHornBase.rotateAngleX = chestPitch * 0.017453292F;
        this.rightHornTip.rotateAngleY = netchestYaw * 0.017453292F;
        this.rightHornTip.rotateAngleX = chestPitch * 0.017453292F;

        this.nose.rotateAngleY = netchestYaw * 0.017453292F;
        this.nose.rotateAngleX = chestPitch * 0.017453292F;

        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}
