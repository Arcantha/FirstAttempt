package com.arcantha.avatar.entity;

import java.util.UUID;

import com.arcantha.avatar.entity.render.AbstractMorph;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityTwoPlayer extends EntityLivingBase implements IEntityAdditionalSpawnData{
	 private String username;
	 private UUID owner;
	 private boolean ownerless = true;
	 private EntityPlayer player;
	 public AbstractMorph morph;

	public EntityTwoPlayer(World worldIn) {
		super(worldIn);
		this.setCustomNameTag("Na'vi");
	}
	
	public EntityTwoPlayer(World worldIn, UUID owner) {
		this(worldIn);
		this.owner = owner;
		this.ownerless = false;
	}

	@Override
	public Iterable<ItemStack> getArmorInventoryList() {
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public ItemStack getItemStackFromSlot(EntityEquipmentSlot slotIn) {
	// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack) {
	// TODO Auto-generated method stub
	
	}

	@Override
	public EnumHandSide getPrimaryHand() {
	// TODO Auto-generated method stub
		return EnumHandSide.RIGHT;
	}

	@Override
	public void writeSpawnData(ByteBuf buffer) {
	// TODO Auto-generated method stub
	
	}

	@Override
	public void readSpawnData(ByteBuf additionalData) {
	// TODO Auto-generated method stub
	
	}

}
