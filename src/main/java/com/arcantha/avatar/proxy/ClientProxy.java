package com.arcantha.avatar.proxy;


import com.arcantha.avatar.entity.EntityTwoPlayer;
import com.arcantha.avatar.entity.render.RenderEntityTwoPlayer;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	public void preLoad(FMLPreInitializationEvent event) {
		super.preLoad(event);
	}
}
