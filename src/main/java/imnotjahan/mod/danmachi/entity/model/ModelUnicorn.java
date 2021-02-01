package imnotjahan.mod.danmachi.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelUnicorn extends ModelBase {
    public ModelRenderer leftEar;
    public ModelRenderer rightEar;
    public ModelRenderer blm;
    public ModelRenderer blb;
    public ModelRenderer flt;
    public ModelRenderer frt;
    public ModelRenderer flm;
    public ModelRenderer frm;
    public ModelRenderer head;
    public ModelRenderer upperMouth;
    public ModelRenderer lowerMouth;
    public ModelRenderer body;
    public ModelRenderer tm;
    public ModelRenderer blt;
    public ModelRenderer neck;
    public ModelRenderer mane;
    public ModelRenderer tt;
    public ModelRenderer tb;
    public ModelRenderer brt;
    public ModelRenderer brm;
    public ModelRenderer brb;
    public ModelRenderer frb;
    public ModelRenderer horn;
    public ModelRenderer flb;

    public ModelUnicorn() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.blb = new ModelRenderer(this, 78, 51);
        this.blb.setRotationPoint(4.0F, 9, 11.0F);
        this.blb.addBox(-2.5F, 12.1F, -2.0F, 4, 3, 4, 0.0F);
        this.leftEar = new ModelRenderer(this, 0, 12);
        this.leftEar.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.leftEar.addBox(-2.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(leftEar, 0.5235987755982988F, 0.0F, 0.2617993877991494F);
        this.horn = new ModelRenderer(this, 0, 0);
        this.horn.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.horn.addBox(-0.5F, -18.0F, 2.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(horn, 0.5235987755982988F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 34);
        this.body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.blt = new ModelRenderer(this, 78, 29);
        this.blt.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.blt.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.neck = new ModelRenderer(this, 0, 12);
        this.neck.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.neck.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(neck, 0.5235987755982988F, 0.0F, 0.0F);
        this.flb = new ModelRenderer(this, 44, 51);
        this.flb.setRotationPoint(4.0F, 9, -8.0F);
        this.flb.addBox(-2.4F, 12.1F, -2.1F, 4, 3, 4, 0.0F);
        this.brb = new ModelRenderer(this, 96, 51);
        this.brb.setRotationPoint(-4.0F, 9, 11.0F);
        this.brb.addBox(-1.5F, 12.1F, -2.0F, 4, 3, 4, 0.0F);
        this.tt = new ModelRenderer(this, 44, 0);
        this.tt.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tt.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tt, -1.3089969389957472F, 0.0F, 0.0F);
        this.frm = new ModelRenderer(this, 60, 41);
        this.frm.setRotationPoint(-4.0F, 9, -8.0F);
        this.frm.addBox(-1.1F, 7.0F, -1.6F, 3, 5, 3, 0.0F);
        this.frb = new ModelRenderer(this, 60, 51);
        this.frb.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.frb.addBox(-1.6F, 12.1F, -2.1F, 4, 3, 4, 0.0F);
        this.tm = new ModelRenderer(this, 38, 7);
        this.tm.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tm.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tm, -1.3089969389957472F, 0.0F, 0.0F);
        this.brm = new ModelRenderer(this, 96, 43);
        this.brm.setRotationPoint(-4.0F, 9, 11.0F);
        this.brm.addBox(-1.0F, 7, -1.5F, 3, 5, 3, 0.0F);
        this.frt = new ModelRenderer(this, 60, 29);
        this.frt.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.frt.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.brt = new ModelRenderer(this, 96, 29);
        this.brt.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.brt.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.flt = new ModelRenderer(this, 44, 29);
        this.flt.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.flt.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.mane = new ModelRenderer(this, 58, 0);
        this.mane.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.mane.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(mane, 0.5235987755982988F, 0.0F, 0.0F);
        this.flm = new ModelRenderer(this, 44, 41);
        this.flm.setRotationPoint(4.0F, 9, -8.0F);
        this.flm.addBox(-1.9F, 7.0F, -1.6F, 3, 5, 3, 0.0F);
        this.rightEar = new ModelRenderer(this, 0, 12);
        this.rightEar.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.rightEar.addBox(0.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(rightEar, 0.5235987755982988F, 0.0F, -0.2617993877991494F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7);
        this.head.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.head.rotateAngleX = 0.5235988F;
        this.blm = new ModelRenderer(this, 78, 43);
        this.blm.setRotationPoint(4.0F, 9, 11.0F);
        this.blm.addBox(-2.0F, 7.0F, -1.5F, 3, 5, 3, 0.0F);
        this.tb = new ModelRenderer(this, 24, 3);
        this.tb.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tb.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tb, -1.5707963267948966F, 0.0F, 0.0F);
        this.upperMouth = new ModelRenderer(this, 24, 18);
        this.upperMouth.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6);
        this.upperMouth.setRotationPoint(0.0F, 3.95F, -10.0F);
        this.upperMouth.rotateAngleX = 0.5235988F;
        this.lowerMouth = new ModelRenderer(this, 24, 27);
        this.lowerMouth.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5);
        this.lowerMouth.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.lowerMouth.rotateAngleX = 0.5235988F;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.blb.render(f5);
        this.leftEar.render(f5);
        this.horn.render(f5);
        this.body.render(f5);
        this.blt.render(f5);
        this.neck.render(f5);
        this.flb.render(f5);
        this.brb.render(f5);
        this.tt.render(f5);
        this.frm.render(f5);
        this.frb.render(f5);
        this.tm.render(f5);
        this.brm.render(f5);
        this.frt.render(f5);
        this.brt.render(f5);
        this.flt.render(f5);
        this.mane.render(f5);
        this.flm.render(f5);
        this.rightEar.render(f5);
        this.head.render(f5);
        this.blm.render(f5);
        this.tb.render(f5);
        this.upperMouth.render(f5);
        this.lowerMouth.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.flt.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.flm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.flb.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.blt.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.blm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.blb.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

        this.frt.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.frm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.frb.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.brt.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.brm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.brb.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        
        float thing = 0.1f;
        
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F + thing;

        this.horn.rotateAngleY = netHeadYaw * 0.017453292F;
        this.horn.rotateAngleX = headPitch * 0.017453292F + thing;

        this.upperMouth.rotateAngleY = netHeadYaw * 0.017453292F;
        this.upperMouth.rotateAngleX = headPitch * 0.017453292F + thing;
        this.lowerMouth.rotateAngleY = netHeadYaw * 0.017453292F;
        this.lowerMouth.rotateAngleX = headPitch * 0.017453292F + thing;

        this.rightEar.rotateAngleY = netHeadYaw * 0.017453292F;
        this.rightEar.rotateAngleX = headPitch * 0.017453292F + thing;
        this.leftEar.rotateAngleY = netHeadYaw * 0.017453292F;
        this.leftEar.rotateAngleX = headPitch * 0.017453292F + thing;

        this.rightEar.rotateAngleY = netHeadYaw * 0.017453292F;
        this.rightEar.rotateAngleX = headPitch * 0.017453292F + thing;
        this.leftEar.rotateAngleY = netHeadYaw * 0.017453292F;
        this.leftEar.rotateAngleX = headPitch * 0.017453292F + thing;

        this.neck.rotateAngleY = netHeadYaw * 0.017453292F;
        this.neck.rotateAngleX = headPitch * 0.017453292F + thing;

        this.mane.rotateAngleY = netHeadYaw * 0.017453292F;
        this.mane.rotateAngleX = headPitch * 0.017453292F + thing;
    }
}