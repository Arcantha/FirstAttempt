package com.arcantha.avatar.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.World;

public class EntityDirehorse extends EntityHorse{

	public EntityDirehorse(World worldIn) {
		super(worldIn);
		
	}
	@Override
	public EntityHorse createChild(EntityAgeable ageable) {
		return new EntityDirehorse(world);
	}
}
