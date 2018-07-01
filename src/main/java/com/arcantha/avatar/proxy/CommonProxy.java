package com.arcantha.avatar.proxy;

import com.arcantha.avatar.entity.EntityTwoPlayer;
import com.arcantha.avatar.entity.render.RenderEntityTwoPlayer;

import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Common proxy
 * 
 * This proxy is responsible for number of things. For registering network 
 * messages, event handlers and capabilities. It also responsible for loading 
 * models.
 */
public class CommonProxy
{
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}

	public void preLoad(FMLPreInitializationEvent event) {

	}
	public void load(FMLInitializationEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityTwoPlayer.class, new RenderEntityTwoPlayer.MorphFactory());
	}
 
}