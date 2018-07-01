package com.arcantha.avatar.entity.render;

import com.arcantha.avatar.entity.EntityDirehorse;
import com.arcantha.avatar.entity.model.ModelDirehorse;
import com.arcantha.avatar.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDirehorse extends RenderLiving<EntityDirehorse>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/direhorse.png");	
	public RenderDirehorse(RenderManager manager) {
		super(manager, new ModelDirehorse(), 0.5F);

	}

	@Override
	protected ResourceLocation getEntityTexture(EntityDirehorse entity) {
		
		return TEXTURES;
	}
	@Override
	protected void applyRotations(EntityDirehorse entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
