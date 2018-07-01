package com.arcantha.avatar;

import io.netty.handler.codec.http.HttpHeaders.Values;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class MainEventHandler {
	@SubscribeEvent
	public void onPlayerTickEvent(PlayerTickEvent event) {
		if(event.player instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.player;
			BlockPos playerUPos = player.getPosition().down();
			BlockPos playerUUPos = player.getPosition().down().down();
			BlockPos playerUNPos = player.getPosition().down().north();
			BlockPos playerUNNPos = player.getPosition().down().north().north();
			BlockPos playerUEPos = player.getPosition().down().east();
			BlockPos playerUEEPos = player.getPosition().down().east().east();
			BlockPos playerUSPos = player.getPosition().down().south();
			BlockPos playerUSSPos = player.getPosition().down().south().south();
			BlockPos playerUWPos = player.getPosition().down().west();
			BlockPos playerUWWPos = player.getPosition().down().west().west();
			BlockPos playerNPos = player.getPosition().north();
			BlockPos playerNNPos = player.getPosition().north().north();
			BlockPos playerEPos = player.getPosition().east();
			BlockPos playerEEPos = player.getPosition().east().east();
			BlockPos playerSPos = player.getPosition().south();
			BlockPos playerSSPos = player.getPosition().south().south();
			BlockPos playerWPos = player.getPosition().west();
			BlockPos playerWWPos = player.getPosition().west().west();
			BlockPos playerNEPos = player.getPosition().north().east();
			BlockPos playerUNEPos = player.getPosition().north().east().down();
			BlockPos playerSEPos = player.getPosition().south().east();
			BlockPos playerUSEPos = player.getPosition().south().east().down();
			BlockPos playerSWPos = player.getPosition().south().west();
			BlockPos playerUSWPos = player.getPosition().south().west().down();
			BlockPos playerNWPos = player.getPosition().north().west();
			BlockPos playerUNWPos = player.getPosition().north().west().down();
			if(player.onGround && player.world.getBlockState(playerUPos).getBlock() == Blocks.GRASS) {
				player.world.setBlockState(playerUPos, Blocks.STONE.getDefaultState());
				}
			if(player.world.getBlockState(playerNPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerNPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerSPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerSPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerWPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUWPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUNPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUNPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUSPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUSPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerWWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerWWPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerNNPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerNNPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerEEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerEEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerSSPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerSSPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUWWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUWWPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUEEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUEEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUSSPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUSSPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUNNPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUNNPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUUPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUUPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerNEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerNEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerSEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerSEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerSWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerSWPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerNWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerNWPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUNEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUNEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUSEPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUSEPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUSWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUSWPos, Blocks.GRASS.getDefaultState());
				}
			if(player.world.getBlockState(playerUNWPos) == Blocks.STONE.getDefaultState()) {
				player.world.setBlockState(playerUNWPos, Blocks.GRASS.getDefaultState());
				}
		}
	}
}

