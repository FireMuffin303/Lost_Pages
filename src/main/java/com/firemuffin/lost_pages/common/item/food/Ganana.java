package com.firemuffin.lost_pages.common.item.food;

import com.firemuffin.lost_pages.core.Lostpages;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Ganana extends Item{
public Ganana() {
	super(new Item.Properties()
			.group(Lostpages.LOSTPAGES)
			.food(new Food.Builder()
				.hunger(4)
				.saturation(2.4f)
				.effect(() -> new EffectInstance(Effects.ABSORPTION,120*20,0),1)
				.effect(() -> new EffectInstance(Effects.REGENERATION,5*20,1),1)
				.setAlwaysEdible()
				.build())
	);
	
}

}

