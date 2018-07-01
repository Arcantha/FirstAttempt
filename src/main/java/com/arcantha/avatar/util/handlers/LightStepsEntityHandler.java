package com.arcantha.avatar.util.handlers;

import com.arcantha.avatar.entity.EntityDirehorse;
import com.arcantha.avatar.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LightStepsEntityHandler{
	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event) {
		if(event.getEntityLiving() instanceof EntityDirehorse) {
			EntityDirehorse direhorse = (EntityDirehorse) event.getEntityLiving();
			BlockPos direhorseUPos = direhorse.getPosition().down();
			BlockPos direhorseUUPos = direhorse.getPosition().down().down();
			BlockPos direhorseUNPos = direhorse.getPosition().down().north();
			BlockPos direhorseUNNPos = direhorse.getPosition().down().north().north();
			BlockPos direhorseUEPos = direhorse.getPosition().down().east();
			BlockPos direhorseUEEPos = direhorse.getPosition().down().east().east();
			BlockPos direhorseUSPos = direhorse.getPosition().down().south();
			BlockPos direhorseUSSPos = direhorse.getPosition().down().south().south();
			BlockPos direhorseUWPos = direhorse.getPosition().down().west();
			BlockPos direhorseUWWPos = direhorse.getPosition().down().west().west();
			BlockPos direhorseNPos = direhorse.getPosition().north();
			BlockPos direhorseNNPos = direhorse.getPosition().north().north();
			BlockPos direhorseEPos = direhorse.getPosition().east();
			BlockPos direhorseEEPos = direhorse.getPosition().east().east();
			BlockPos direhorseSPos = direhorse.getPosition().south();
			BlockPos direhorseSSPos = direhorse.getPosition().south().south();
			BlockPos direhorseWPos = direhorse.getPosition().west();
			BlockPos direhorseWWPos = direhorse.getPosition().west().west();
			BlockPos direhorseNEPos = direhorse.getPosition().north().east();
			BlockPos direhorseUNEPos = direhorse.getPosition().north().east().down();
			BlockPos direhorseSEPos = direhorse.getPosition().south().east();
			BlockPos direhorseUSEPos = direhorse.getPosition().south().east().down();
			BlockPos direhorseSWPos = direhorse.getPosition().south().west();
			BlockPos direhorseUSWPos = direhorse.getPosition().south().west().down();
			BlockPos direhorseNWPos = direhorse.getPosition().north().west();
			BlockPos direhorseUNWPos = direhorse.getPosition().north().west().down();
			long minecraftTime = direhorse.world.getWorldTime();
			long minecraftNTime = 12570;
			long minecraftDTime = 24000;
			if(direhorse.onGround && direhorse.world.getBlockState(direhorseUPos).getBlock() == Blocks.GRASS && minecraftTime > minecraftNTime && minecraftTime < minecraftDTime ) {
				direhorse.world.setBlockState(direhorseUPos, ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState());
			}
			if(direhorse.world.getBlockState(direhorseNPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseNPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseSPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseSPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseWPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUWPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUNPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUNPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUSPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUSPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseWWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseWWPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseNNPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseNNPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseEEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseEEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseSSPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseSSPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUWWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUWWPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUEEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUEEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUSSPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUSSPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUNNPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUNNPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUUPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUUPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseNEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseNEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseSEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseSEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseSWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseSWPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseNWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseNWPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUNEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUNEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUSEPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUSEPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUSWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUSWPos, Blocks.GRASS.getDefaultState());
				}
			if(direhorse.world.getBlockState(direhorseUNWPos) == ModBlocks.GRASS_LIGHT_BLOCK.getDefaultState()) {
				direhorse.world.setBlockState(direhorseUNWPos, Blocks.GRASS.getDefaultState());
				}
		}
	}
}