package imnotjahan.mod.danmachi.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelGoblin extends ModelBase {
    public ModelRenderer rightArm;
    public ModelRenderer rightLeg;
    public ModelRenderer head;
    public ModelRenderer chest;
    public ModelRenderer leftArm;
    public ModelRenderer leftLeg;
    public ModelRenderer rightHorn;
    public ModelRenderer leftHorn;

    public ModelGoblin() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.chest = new ModelRenderer(this, 16, 16);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addBox(-4.0F, 6.0F, -2.0F, 8, 12, 4, 0.0F);
        this.leftArm = new ModelRenderer(this, 32, 48);
        this.leftArm.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.leftArm.addBox(4.0F, 5.0F, -2.0F, 4, 12, 4, 0.0F);
        this.leftLeg = new ModelRenderer(this, 16, 48);
        this.leftLeg.setRotationPoint(1.9F, 18.0F, 0.0F);
        this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightLeg = new ModelRenderer(this, 0, 16);
        this.rightLeg.setRotationPoint(-1.9F, 18.0F, 0.0F);
        this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightHorn = new ModelRenderer(this, 0, 0);
        this.rightHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightHorn.addBox(-3.0F, -3.0F, -5.0F, 1, 2, 1, 0.0F);
        this.rightArm = new ModelRenderer(this, 40, 16);
        this.rightArm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        this.rightArm.addBox(-3.0F, 5.0F, -2.0F, 4, 12, 4, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -2.0F, -4.0F, 8, 8, 8, 0.0F);
        this.leftHorn = new ModelRenderer(this, 0, 0);
        this.leftHorn.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftHorn.addBox(2.0F, -3.0F, -5.0F, 1, 2, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.chest.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.leftArm.offsetX, this.leftArm.offsetY, this.leftArm.offsetZ);
        GlStateManager.translate(this.leftArm.rotationPointX * f5, this.leftArm.rotationPointY * f5, this.leftArm.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.leftArm.offsetX, -this.leftArm.offsetY, -this.leftArm.offsetZ);
        GlStateManager.translate(-this.leftArm.rotationPointX * f5, -this.leftArm.rotationPointY * f5, -this.leftArm.rotationPointZ * f5);
        this.leftArm.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.leftLeg.offsetX, this.leftLeg.offsetY, this.leftLeg.offsetZ);
        GlStateManager.translate(this.leftLeg.rotationPointX * f5, this.leftLeg.rotationPointY * f5, this.leftLeg.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.5D, 1.0D);
        GlStateManager.translate(-this.leftLeg.offsetX, -this.leftLeg.offsetY, -this.leftLeg.offsetZ);
        GlStateManager.translate(-this.leftLeg.rotationPointX * f5, -this.leftLeg.rotationPointY * f5, -this.leftLeg.rotationPointZ * f5);
        this.leftLeg.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rightLeg.offsetX, this.rightLeg.offsetY, this.rightLeg.offsetZ);
        GlStateManager.translate(this.rightLeg.rotationPointX * f5, this.rightLeg.rotationPointY * f5, this.rightLeg.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.5D, 1.0D);
        GlStateManager.translate(-this.rightLeg.offsetX, -this.rightLeg.offsetY, -this.rightLeg.offsetZ);
        GlStateManager.translate(-this.rightLeg.rotationPointX * f5, -this.rightLeg.rotationPointY * f5, -this.rightLeg.rotationPointZ * f5);
        this.rightLeg.render(f5);
        GlStateManager.popMatrix();
        this.rightHorn.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rightArm.offsetX, this.rightArm.offsetY, this.rightArm.offsetZ);
        GlStateManager.translate(this.rightArm.rotationPointX * f5, this.rightArm.rotationPointY * f5, this.rightArm.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 0.7D, 1.0D);
        GlStateManager.translate(-this.rightArm.offsetX, -this.rightArm.offsetY, -this.rightArm.offsetZ);
        GlStateManager.translate(-this.rightArm.rotationPointX * f5, -this.rightArm.rotationPointY * f5, -this.rightArm.rotationPointZ * f5);
        this.rightArm.render(f5);
        GlStateManager.popMatrix();
        this.head.render(f5);
        this.leftHorn.render(f5);
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

        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;

        this.rightHorn.rotateAngleY = netHeadYaw * 0.017453292F;
        this.rightHorn.rotateAngleX = headPitch * 0.017453292F;
        this.leftHorn.rotateAngleY = netHeadYaw * 0.017453292F;
        this.leftHorn.rotateAngleX = headPitch * 0.017453292F;
    }
}
