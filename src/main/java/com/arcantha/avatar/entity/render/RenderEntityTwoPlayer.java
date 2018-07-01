package com.arcantha.avatar.entity.render;

import com.arcantha.avatar.entity.EntityDirehorse;
import com.arcantha.avatar.entity.EntityTwoPlayer;
import com.arcantha.avatar.entity.model.ModelPlayerTwo;
import com.arcantha.avatar.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEntityTwoPlayer extends RenderLivingBase<EntityTwoPlayer>
{
	EntityTwoPlayer player;
	 public ModelPlayer getMainModel()
	    {
	        return (ModelPlayer)super.getMainModel();
	    }
	public static final ResourceLocation TEXTURESPLAYER = new ResourceLocation(Reference.MOD_ID + ":textures/entity/ModelOneTex.png");
	public RenderEntityTwoPlayer(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelPlayerTwo(), shadowSizeIn);
		this.player = new EntityTwoPlayer(Minecraft.getMinecraft().world);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTwoPlayer entity) {
		return TEXTURESPLAYER;
	}
	public void doRender(EntityTwoPlayer entity, double x, double y, double z, float entityYaw, float partialTicks) {
		this.mainModel = new ModelPlayerTwo();
		this.bindTexture(TEXTURESPLAYER);
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
	@Override
	protected void applyRotations(EntityTwoPlayer entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
	@Override
	protected void preRenderCallback(EntityTwoPlayer entity, float partialTickTime) {

	}
	public static class MorphFactory implements IRenderFactory<EntityTwoPlayer>{

		@Override
		public Render<? super EntityTwoPlayer> createRenderFor(RenderManager manager) {
			// TODO Auto-generated method stub
			return new RenderEntityTwoPlayer(manager, null, 0.5F);
		}
		
	}
}