package com.arcantha.avatar;
import com.arcantha.avatar.entity.EntityTwoPlayer;
import com.arcantha.avatar.entity.render.RenderEntityTwoPlayer;
import com.arcantha.avatar.proxy.CommonProxy;
import com.arcantha.avatar.util.Reference;
import com.arcantha.avatar.util.handlers.LightStepsEntityHandler;
import com.arcantha.avatar.util.handlers.LightStepsHandler;
import com.arcantha.avatar.util.handlers.RegistryHandler;
import com.arcantha.avatar.util.handlers.RenderPlayerHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:llibrary@[1.7.9,)")
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries();
		
		proxy.preLoad(event);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.load(event);
		MinecraftForge.EVENT_BUS.register(new RenderPlayerHandler());
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new LightStepsHandler());
		MinecraftForge.EVENT_BUS.register(new LightStepsEntityHandler());
	}
}
