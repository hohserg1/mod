package imnotjahan.mod.danmachi.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.util.math.MathHelper;

/**
 * ModelRabbit - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelAlmiraj extends ModelBase {
    public ModelRenderer head;
    public ModelRenderer leftEar;
    public ModelRenderer nose;
    public ModelRenderer rightEar;
    public ModelRenderer tail;
    public ModelRenderer lbf;
    public ModelRenderer lbl;
    public ModelRenderer body;
    public ModelRenderer rfl;
    public ModelRenderer rbf;
    public ModelRenderer rbl;
    public ModelRenderer lfl;
    public ModelRenderer horn;

    private float jumpRotation;

    public ModelAlmiraj() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 32, 0);
        this.head.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.head.addBox(-2.5F, -4.0F, -5.0F, 5, 4, 5, 0.0F);
        this.leftEar = new ModelRenderer(this, 58, 0);
        this.leftEar.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.leftEar.addBox(0.5F, -9.0F, -1.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(leftEar, 0.0F, 0.2617993950843811F, 0.0F);
        this.lbl = new ModelRenderer(this, 30, 15);
        this.lbl.setRotationPoint(3.0F, 17.5F, 3.7F);
        this.lbl.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 5, 0.0F);
        this.setRotateAngle(lbl, -0.3665191429188092F, 0.0F, 0.0F);
        this.rightEar = new ModelRenderer(this, 52, 0);
        this.rightEar.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.rightEar.addBox(-2.5F, -9.0F, -1.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(rightEar, 0.0F, -0.2617993877991494F, 0.0F);
        this.lbf = new ModelRenderer(this, 26, 24);
        this.lbf.setRotationPoint(3.0F, 17.5F, 3.7F);
        this.lbf.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 7, 0.0F);
        this.horn = new ModelRenderer(this, 0, 0);
        this.horn.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.horn.addBox(-0.5F, -10.0F, -3.0F, 1, 7, 1, 0.0F);
        this.rbl = new ModelRenderer(this, 16, 15);
        this.rbl.setRotationPoint(-3.0F, 17.5F, 3.7F);
        this.rbl.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 5, 0.0F);
        this.setRotateAngle(rbl, -0.3665191429188092F, 0.0F, 0.0F);
        this.lfl = new ModelRenderer(this, 8, 15);
        this.lfl.setRotationPoint(3.0F, 17.0F, -1.0F);
        this.lfl.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(lfl, -0.19198621771937624F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 52, 6);
        this.tail.setRotationPoint(0.0F, 20.0F, 7.0F);
        this.tail.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(tail, -0.3490658503988659F, 0.0F, 0.0F);
        this.rfl = new ModelRenderer(this, 0, 15);
        this.rfl.setRotationPoint(-3.0F, 17.0F, -1.0F);
        this.rfl.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rfl, -0.19198621771937624F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 19.0F, 8.0F);
        this.body.addBox(-3.0F, -2.0F, -10.0F, 6, 5, 10, 0.0F);
        this.setRotateAngle(body, -0.3490658503988659F, 0.0F, 0.0F);
        this.rbf = new ModelRenderer(this, 8, 24);
        this.rbf.setRotationPoint(-3.0F, 17.5F, 3.7F);
        this.rbf.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 7, 0.0F);
        this.nose = new ModelRenderer(this, 32, 9);
        this.nose.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.nose.addBox(-0.5F, -2.5F, -5.5F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        GlStateManager.pushMatrix();
        GlStateManager.scale(0.6F, 0.6F, 0.6F);
        GlStateManager.translate(0.0F, 16.0F * scale, 0.0F);
        this.lbf.render(scale);
        this.rbf.render(scale);
        this.rbl.render(scale);
        this.lbl.render(scale);
        this.body.render(scale);
        this.rfl.render(scale);
        this.lfl.render(scale);
        this.head.render(scale);
        this.rightEar.render(scale);
        this.leftEar.render(scale);
        this.tail.render(scale);
        this.nose.render(scale);
        this.horn.render(scale);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        float f = ageInTicks - (float)entityIn.ticksExisted;
        EntityRabbit entityrabbit = (EntityRabbit)entityIn;
        this.nose.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.rightEar.rotateAngleX = headPitch * 0.017453292F;
        this.leftEar.rotateAngleX = headPitch * 0.017453292F;
        this.nose.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.rightEar.rotateAngleY = this.nose.rotateAngleY - 0.2617994F;
        this.leftEar.rotateAngleY = this.nose.rotateAngleY + 0.2617994F;
        this.jumpRotation = MathHelper.sin(entityrabbit.setJumpCompletion(f) * (float)Math.PI);
        this.lbl.rotateAngleX = (this.jumpRotation * 50.0F - 21.0F) * 0.017453292F;
        this.rbl.rotateAngleX = (this.jumpRotation * 50.0F - 21.0F) * 0.017453292F;
        this.lbf.rotateAngleX = this.jumpRotation * 50.0F * 0.017453292F;
        this.rbf.rotateAngleX = this.jumpRotation * 50.0F * 0.017453292F;
        this.lfl.rotateAngleX = (this.jumpRotation * -40.0F - 11.0F) * 0.017453292F;
        this.rfl.rotateAngleX = (this.jumpRotation * -40.0F - 11.0F) * 0.017453292F;
        this.horn.rotateAngleY = netHeadYaw * 0.017453292F;
        this.horn.rotateAngleX = headPitch * 0.017453292F;
    }
}
