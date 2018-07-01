package com.arcantha.avatar.entity.model;

import com.arcantha.avatar.entity.EntityTwoPlayer;

import net.ilexiconn.llibrary.client.model.tabula.ITabulaModelAnimator;
import net.ilexiconn.llibrary.client.model.tabula.TabulaModel;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Na'vi Model One - Arcantha
 * Created using Tabula 7.0.0
 */
public class ModelPlayerTwo extends AdvancedModelBase implements ITabulaModelAnimator<EntityTwoPlayer>{
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Ear1;
    public AdvancedModelRenderer Ear2;
    public AdvancedModelRenderer Hair1;
    public AdvancedModelRenderer Nose;
    public AdvancedModelRenderer Chest;
    public AdvancedModelRenderer Torso;
    public AdvancedModelRenderer Shoulder1;
    public AdvancedModelRenderer Shoulder2;
    public AdvancedModelRenderer Torso2;
    public AdvancedModelRenderer Torso3;
    public AdvancedModelRenderer Thigh1;
    public AdvancedModelRenderer Thigh2;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer Thigh11;
    public AdvancedModelRenderer Knee1;
    public AdvancedModelRenderer Leg1;
    public AdvancedModelRenderer Foot1;
    public AdvancedModelRenderer Thigh22;
    public AdvancedModelRenderer Knee2;
    public AdvancedModelRenderer Leg2;
    public AdvancedModelRenderer Foot2;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Bicep1;
    public AdvancedModelRenderer Tricep1;
    public AdvancedModelRenderer Hand1;
    public AdvancedModelRenderer Bicep2;
    public AdvancedModelRenderer Tricep2;
    public AdvancedModelRenderer Hand2;
    public AdvancedModelRenderer Hair2;
    public AdvancedModelRenderer Hair3;
    public AdvancedModelRenderer Hair4;

    public ModelPlayerTwo() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.Thigh22 = new AdvancedModelRenderer(this, 0, 0);
        this.Thigh22.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.Thigh22.addBox(0.0F, 0.0F, 0.0F, 7, 15, 7, 0.0F);
        this.setRotateAngle(Thigh22, -0.04555309347705183F, 0.0F, 0.0F);
        this.Chest = new AdvancedModelRenderer(this, 0, 0);
        this.Chest.setRotationPoint(-3.5F, 4.7F, -2.6F);
        this.Chest.addBox(0.0F, 0.0F, 0.0F, 12, 8, 9, 0.0F);
        this.Knee1 = new AdvancedModelRenderer(this, 0, 0);
        this.Knee1.setRotationPoint(0.5F, 13.0F, -0.5F);
        this.Knee1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Knee1, 0.045553093477054454F, 0.0F, 0.0F);
        this.Thigh2 = new AdvancedModelRenderer(this, 0, 0);
        this.Thigh2.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.Thigh2.addBox(0.0F, 0.0F, 0.0F, 7, 6, 8, 0.0F);
        this.setRotateAngle(Thigh2, -3.7203930645425404E-16F, 0.0F, 0.0F);
        this.Bicep2 = new AdvancedModelRenderer(this, 0, 0);
        this.Bicep2.setRotationPoint(2.5F, 5.0F, 1.0F);
        this.Bicep2.addBox(0.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(Bicep2, 0.0F, 0.0F, -0.091106186954104F);
        this.Shoulder1 = new AdvancedModelRenderer(this, 0, 0);
        this.Shoulder1.setRotationPoint(-4.0F, 0.0F, 1.0F);
        this.Shoulder1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Shoulder1, 1.0618621871715168E-15F, 0.0F, 0.0F);
        this.Hair1 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair1.setRotationPoint(-0.5F, -0.5F, 2.5F);
        this.Hair1.addBox(0.0F, 0.0F, 0.0F, 9, 8, 6, 0.0F);
        this.Tricep2 = new AdvancedModelRenderer(this, 0, 0);
        this.Tricep2.setRotationPoint(0.5F, 8.0F, 0.5F);
        this.Tricep2.addBox(0.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
        this.setRotateAngle(Tricep2, -0.13913389021875522F, 0.0F, 0.0F);
        this.Hair2 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair2.setRotationPoint(2.5F, 5.0F, 3.0F);
        this.Hair2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail1.setRotationPoint(2.0F, 4.3F, 5.1F);
        this.Tail1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Thigh11 = new AdvancedModelRenderer(this, 0, 0);
        this.Thigh11.setRotationPoint(2.0F, 5.0F, 0.0F);
        this.Thigh11.addBox(0.0F, 0.0F, 0.0F, 7, 15, 7, 0.0F);
        this.setRotateAngle(Thigh11, -0.045553093477051866F, 0.0F, 0.0F);
        this.Tricep1 = new AdvancedModelRenderer(this, 0, 0);
        this.Tricep1.setRotationPoint(0.5F, 8.0F, 0.5F);
        this.Tricep1.addBox(0.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
        this.setRotateAngle(Tricep1, -0.13910274138394807F, 0.0F, 0.0F);
        this.Thigh1 = new AdvancedModelRenderer(this, 0, 0);
        this.Thigh1.setRotationPoint(3.0F, 5.0F, 0.0F);
        this.Thigh1.addBox(0.0F, 0.0F, 0.0F, 7, 6, 8, 0.0F);
        this.setRotateAngle(Thigh1, -1.0696130060559805E-15F, 0.0F, 0.0F);
        this.Hand2 = new AdvancedModelRenderer(this, 0, 0);
        this.Hand2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Hand2.addBox(0.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(Hand2, 0.02339519918542599F, 0.0F, 0.0F);
        this.Ear2 = new AdvancedModelRenderer(this, 0, 0);
        this.Ear2.setRotationPoint(8.5F, 0.0F, 4.0F);
        this.Ear2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(Ear2, -0.22759093446006054F, 0.0F, 0.091106186954104F);
        this.Leg1 = new AdvancedModelRenderer(this, 0, 0);
        this.Leg1.setRotationPoint(0.5F, 5.5F, 1.5F);
        this.Leg1.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
        this.setRotateAngle(Leg1, 0.045553093477052F, 0.0F, 0.0F);
        this.Hair3 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair3.setRotationPoint(0.5F, 0.0F, 0.8F);
        this.Hair3.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
        this.setRotateAngle(Hair3, 0.18203784098300857F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 0, 0);
        this.Neck.setRotationPoint(2.0F, 8.0F, 2.0F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 5, 6, 5, 0.0F);
        this.Knee2 = new AdvancedModelRenderer(this, 0, 0);
        this.Knee2.setRotationPoint(0.5F, 13.0F, -0.5F);
        this.Knee2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Knee2, 0.04555309347705094F, 0.0F, 0.0F);
        this.Torso3 = new AdvancedModelRenderer(this, 0, 0);
        this.Torso3.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.Torso3.addBox(0.0F, 0.0F, 0.0F, 8, 6, 6, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail3.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
        this.setRotateAngle(Tail3, -0.136659280431156F, 0.0F, 0.0F);
        this.Hand1 = new AdvancedModelRenderer(this, 0, 0);
        this.Hand1.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Hand1.addBox(0.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
        this.setRotateAngle(Hand1, 0.023387411976724014F, 0.0F, 0.0F);
        this.Hair4 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair4.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Hair4.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
        this.setRotateAngle(Hair4, -0.136659280431156F, 0.0F, 0.0F);
        this.Leg2 = new AdvancedModelRenderer(this, 0, 0);
        this.Leg2.setRotationPoint(0.5F, 5.5F, 1.5F);
        this.Leg2.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
        this.setRotateAngle(Leg2, 0.045553093477052F, 0.0F, 0.0F);
        this.Foot1 = new AdvancedModelRenderer(this, 0, 0);
        this.Foot1.setRotationPoint(0.0F, 15.0F, -5.0F);
        this.Foot1.addBox(0.0F, 0.0F, 0.0F, 5, 4, 11, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail2.setRotationPoint(0.5F, 1.1F, 2.2F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F);
        this.setRotateAngle(Tail2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Nose = new AdvancedModelRenderer(this, 0, 0);
        this.Nose.setRotationPoint(3.0F, 3.0F, -0.5F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.Foot2 = new AdvancedModelRenderer(this, 0, 0);
        this.Foot2.setRotationPoint(0.0F, 15.0F, -5.0F);
        this.Foot2.addBox(0.0F, 0.0F, 0.0F, 5, 4, 11, 0.0F);
        this.Shoulder2 = new AdvancedModelRenderer(this, 0, 0);
        this.Shoulder2.setRotationPoint(10.0F, 0.0F, 1.0F);
        this.Shoulder2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Shoulder2, 1.5501637768927252E-16F, 0.0F, 0.0F);
        this.Torso = new AdvancedModelRenderer(this, 0, 0);
        this.Torso.setRotationPoint(1.0F, 6.0F, 2.0F);
        this.Torso.addBox(0.0F, 0.0F, 0.0F, 10, 6, 6, 0.0F);
        this.Ear1 = new AdvancedModelRenderer(this, 0, 0);
        this.Ear1.setRotationPoint(-1.5F, 0.0F, 4.0F);
        this.Ear1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(Ear1, -0.22759093446006054F, 0.0F, -0.091106186954104F);
        this.Bicep1 = new AdvancedModelRenderer(this, 0, 0);
        this.Bicep1.setRotationPoint(-0.5F, 5.0F, 0.0F);
        this.Bicep1.addBox(0.0F, 0.0F, 0.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(Bicep1, 0.0F, 0.0F, 0.045553093477052F);
        this.Head = new AdvancedModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-4.5F, -37.7F, -4.5F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 8, 9, 8, 0.0F);
        this.Torso2 = new AdvancedModelRenderer(this, 0, 0);
        this.Torso2.setRotationPoint(1.0F, 6.0F, 0.0F);
        this.Torso2.addBox(0.0F, 0.0F, 0.0F, 8, 6, 5, 0.0F);
        this.Thigh2.addChild(this.Thigh22);
        this.Neck.addChild(this.Chest);
        this.Thigh11.addChild(this.Knee1);
        this.Torso3.addChild(this.Thigh2);
        this.Shoulder2.addChild(this.Bicep2);
        this.Chest.addChild(this.Shoulder1);
        this.Head.addChild(this.Hair1);
        this.Bicep2.addChild(this.Tricep2);
        this.Hair1.addChild(this.Hair2);
        this.Torso3.addChild(this.Tail1);
        this.Thigh1.addChild(this.Thigh11);
        this.Bicep1.addChild(this.Tricep1);
        this.Torso3.addChild(this.Thigh1);
        this.Tricep2.addChild(this.Hand2);
        this.Head.addChild(this.Ear2);
        this.Knee1.addChild(this.Leg1);
        this.Hair2.addChild(this.Hair3);
        this.Head.addChild(this.Neck);
        this.Thigh22.addChild(this.Knee2);
        this.Torso2.addChild(this.Torso3);
        this.Tail2.addChild(this.Tail3);
        this.Tricep1.addChild(this.Hand1);
        this.Hair3.addChild(this.Hair4);
        this.Knee2.addChild(this.Leg2);
        this.Leg1.addChild(this.Foot1);
        this.Tail1.addChild(this.Tail2);
        this.Head.addChild(this.Nose);
        this.Leg2.addChild(this.Foot2);
        this.Chest.addChild(this.Shoulder2);
        this.Chest.addChild(this.Torso);
        this.Head.addChild(this.Ear1);
        this.Shoulder1.addChild(this.Bicep1);
        this.Torso.addChild(this.Torso2);
        updateDefaultPose();
    }
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
        GlStateManager.translate(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
        GlStateManager.scale(0.68D, 0.81D, 0.81D);
        GlStateManager.translate(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
        GlStateManager.translate(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
        this.Head.render(f5);
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

	@Override
	public void setRotationAngles(TabulaModel model, EntityTwoPlayer entity, float f, float f1, float f2,
			float f3, float f4, float f5) {
		// TODO Auto-generated method stub
		
	}


}
