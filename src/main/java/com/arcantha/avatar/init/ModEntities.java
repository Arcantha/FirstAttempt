package com.arcantha.avatar.init;

import com.arcantha.avatar.Main;
import com.arcantha.avatar.entity.EntityDirehorse;
import com.arcantha.avatar.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntities() {
		registerEntity("direhorse", EntityDirehorse.class, Reference.ENTITY_DIREHORSE, 50, 5922670, 8072929);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
