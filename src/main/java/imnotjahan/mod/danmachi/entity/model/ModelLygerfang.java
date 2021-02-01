package imnotjahan.mod.danmachi.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPig - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelLygerfang extends ModelBase {
    public ModelRenderer body;
    public ModelRenderer lbl;
    public ModelRenderer lfl;
    public ModelRenderer rbl;
    public ModelRenderer rfl;
    public ModelRenderer head;
    public ModelRenderer nose;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer leftEar;
    public ModelRenderer rightEar;

    public ModelLygerfang() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.rfl = new ModelRenderer(this, 0, 16);
        this.rfl.setRotationPoint(-3.0F, 18.0F, -5.0F);
        this.rfl.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.tail2 = new ModelRenderer(this, 16, 24);
        this.tail2.setRotationPoint(-1.0F, 15.7F, 17.0F);
        this.tail2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.lfl = new ModelRenderer(this, 0, 16);
        this.lfl.setRotationPoint(3.0F, 18.0F, -5.0F);
        this.lfl.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.tail1 = new ModelRenderer(this, 16, 24);
        this.tail1.setRotationPoint(-1.0F, 14.0F, 12.0F);
        this.tail1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(tail1, -0.31869712141416456F, 0.0F, 0.0F);
        this.rbl = new ModelRenderer(this, 0, 16);
        this.rbl.setRotationPoint(-3.0F, 18.0F, 10.0F);
        this.rbl.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.nose = new ModelRenderer(this, 16, 16);
        this.nose.setRotationPoint(0.0F, 14.0F, -6.0F);
        this.nose.addBox(-2.0F, 0.0F, -9.0F, 4, 3, 1, 0.0F);
        this.rightEar = new ModelRenderer(this, 0, 29);
        this.rightEar.setRotationPoint(0.0F, 14.0F, -6.0F);
        this.rightEar.addBox(-4.0F, -5.0F, -7.0F, 2, 2, 1, 0.0F);
        this.leftEar = new ModelRenderer(this, 0, 29);
        this.leftEar.setRotationPoint(0.0F, 14.0F, -6.0F);
        this.leftEar.addBox(2.0F, -5.0F, -7.0F, 2, 2, 1, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 14.0F, -6.0F);
        this.head.addBox(-4.0F, -3.0F, -8.0F, 8, 7, 8, 0.0F);
        this.body = new ModelRenderer(this, 32, 0);
        this.body.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 20, 6, 0.0F);
        this.setRotateAngle(body, 1.5707963267948966F, 0.0F, 0.0F);
        this.lbl = new ModelRenderer(this, 0, 16);
        this.lbl.setRotationPoint(3.0F, 18.0F, 10.0F);
        this.lbl.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.rfl.render(f5);
        this.tail2.render(f5);
        this.lfl.render(f5);
        this.tail1.render(f5);
        this.rbl.render(f5);
        this.nose.render(f5);
        this.rightEar.render(f5);
        this.leftEar.render(f5);
        this.head.render(f5);
        this.body.render(f5);
        this.lbl.render(f5);
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

        this.nose.rotateAngleX = headPitch * 0.017453292F;
        this.nose.rotateAngleY = netHeadYaw * 0.017453292F;

        this.leftEar.rotateAngleX = headPitch * 0.017453292F;
        this.leftEar.rotateAngleY = netHeadYaw * 0.017453292F;

        this.rightEar.rotateAngleX = headPitch * 0.017453292F;
        this.rightEar.rotateAngleY = netHeadYaw * 0.017453292F;

        this.body.rotateAngleX = ((float)Math.PI / 2F);

        this.lfl.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.lbl.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rfl.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.rbl.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
