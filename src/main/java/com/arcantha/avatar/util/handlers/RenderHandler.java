package com.arcantha.avatar.util.handlers;

import com.arcantha.avatar.entity.EntityDirehorse;
import com.arcantha.avatar.entity.render.RenderDirehorse;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityDirehorse.class, new IRenderFactory<EntityDirehorse>() {
			@Override
			public Render<? super EntityDirehorse> createRenderFor(RenderManager manager){
				return new RenderDirehorse(manager);
			}
		});
	}
}
