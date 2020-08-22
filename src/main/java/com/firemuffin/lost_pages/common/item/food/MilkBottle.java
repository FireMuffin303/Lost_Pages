package com.firemuffin.lost_pages.common.item.food;

import com.firemuffin.lost_pages.core.Lostpages;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.stats.Stats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class MilkBottle extends Item {

	public MilkBottle() {
		super(new Item.Properties()
				.group(Lostpages.LOSTPAGES)
				.food(new Food.Builder()
						.setAlwaysEdible()
						.build()
						)
				.maxStackSize(16)
				);
	}
	
	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}

	@Override
	public SoundEvent getDrinkSound() {
	   return SoundEvents.ENTITY_GENERIC_DRINK;
	}

	@Override
	public SoundEvent getEatSound() {
	   return SoundEvents.ENTITY_GENERIC_DRINK;
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
	      super.onItemUseFinish(stack, worldIn, entityLiving);
	      if (entityLiving instanceof ServerPlayerEntity) {
	         ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entityLiving;
	         CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
	         serverplayerentity.addStat(Stats.ITEM_USED.get(this));
	      }

	      if (!worldIn.isRemote) {
					entityLiving.clearActivePotions();
				}
		    

	      if (stack.isEmpty()) {
	         return new ItemStack(Items.GLASS_BOTTLE);
	      } else {
	         if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode) {
	            ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
	            PlayerEntity playerentity = (PlayerEntity)entityLiving;
	            if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
	               playerentity.dropItem(itemstack, false);
	            }
	         }

	         return stack;
	      }
	   }
	
}
