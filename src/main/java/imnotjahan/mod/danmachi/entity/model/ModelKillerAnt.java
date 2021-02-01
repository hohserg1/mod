package imnotjahan.mod.danmachi.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelKillerAnt extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer bll;
    public ModelRenderer fll;
    public ModelRenderer brl;
    public ModelRenderer frl;
    public ModelRenderer head;
    public ModelRenderer bodyBack;
    public ModelRenderer mrl;
    public ModelRenderer mll;
    public ModelRenderer leftPincer;
    public ModelRenderer rightPincer;

    public ModelKillerAnt() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.mrl = new ModelRenderer(this, 0, 16);
        this.mrl.setRotationPoint(-4.0F, 12.0F, 0.0F);
        this.mrl.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(mrl, 0.0F, 0.0F, 0.17453292519943295F);
        this.mll = new ModelRenderer(this, 0, 16);
        this.mll.setRotationPoint(4.0F, 12.0F, 0.0F);
        this.mll.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(mll, 0.0F, 0.0F, -0.17453292519943295F);
        this.body = new ModelRenderer(this, 10, 7);
        this.body.setRotationPoint(0.0F, 9.0F, 2.0F);
        this.body.addBox(-4.5F, -10.0F, -7.0F, 9, 18, 7, 0.0F);
        this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
        this.frl = new ModelRenderer(this, 0, 16);
        this.frl.setRotationPoint(-4.0F, 12.0F, -5.0F);
        this.frl.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(frl, -0.17453292519943295F, 0.0F, 0.17453292519943295F);
        this.brl = new ModelRenderer(this, 0, 16);
        this.brl.setRotationPoint(-4.0F, 12.0F, 5.0F);
        this.brl.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(brl, 0.17453292519943295F, 0.0F, 0.17453292519943295F);
        this.rightPincer = new ModelRenderer(this, 0, 32);
        this.rightPincer.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.rightPincer.addBox(-7.0F, 1.0F, -14.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(rightPincer, 0.0F, -0.2617993877991494F, 0.0F);
        this.head = new ModelRenderer(this, 32, 0);
        this.head.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.head.addBox(-5.0F, -4.0F, -10.0F, 10, 8, 10, 0.0F);
        this.bll = new ModelRenderer(this, 0, 16);
        this.bll.setRotationPoint(4.0F, 12.0F, 5.0F);
        this.bll.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(bll, 0.17453292519943295F, 0.0F, -0.17453292519943295F);
        this.leftPincer = new ModelRenderer(this, 0, 32);
        this.leftPincer.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.leftPincer.addBox(5.0F, 1.0F, -14.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(leftPincer, 0.0F, 0.2617993877991494F, 0.0F);
        this.fll = new ModelRenderer(this, 0, 16);
        this.fll.setRotationPoint(4.0F, 12.0F, -5.0F);
        this.fll.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(fll, -0.17453292519943295F, 0.0F, -0.17453292519943295F);
        this.bodyBack = new ModelRenderer(this, 0, 8);
        this.bodyBack.setRotationPoint(0.0F, 9.0F, 20.0F);
        this.bodyBack.addBox(-7.0F, -3.0F, -10.0F, 14, 10, 14, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.mrl.render(f5);
        this.mll.render(f5);
        this.body.render(f5);
        this.frl.render(f5);
        this.brl.render(f5);
        this.rightPincer.render(f5);
        this.head.render(f5);
        this.bll.render(f5);
        this.leftPincer.render(f5);
        this.fll.render(f5);
        this.bodyBack.render(f5);
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
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;

        this.leftPincer.rotateAngleX = headPitch * 0.017453292F;
        this.leftPincer.rotateAngleY = netHeadYaw * 0.017453292F;

        this.rightPincer.rotateAngleX = headPitch * 0.017453292F;
        this.rightPincer.rotateAngleY = netHeadYaw * 0.017453292F;

        this.body.rotateAngleX = ((float)Math.PI / 2F);

        this.fll.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.brl.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.frl.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.mll.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.bll.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.mrl.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
