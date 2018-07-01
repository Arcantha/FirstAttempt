package com.arcantha.avatar.util.handlers;

import com.arcantha.avatar.entity.EntityTwoPlayer;
import com.arcantha.avatar.entity.model.ModelPlayerTwo;
import com.arcantha.avatar.entity.render.RenderEntityTwoPlayer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderPlayerHandler{
	
	
	public RenderPlayerHandler() {
		
	}
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onPlayerRender(RenderPlayerEvent.Pre event) {
		if(event.getEntity() instanceof EntityPlayer) {
			event.setCanceled(true);
		}
		RenderManager manager = Minecraft.getMinecraft().getRenderManager();
		final RenderEntityTwoPlayer modelRenderer = new RenderEntityTwoPlayer(manager, new ModelPlayerTwo(), 1.5F);
		modelRenderer.doRender(new EntityTwoPlayer(Minecraft.getMinecraft().world), 0D, 0D, 0D, 0F, 0F);
	}
}