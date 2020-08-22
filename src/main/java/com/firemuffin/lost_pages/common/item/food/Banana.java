package com.firemuffin.lost_pages.common.item.food;

import com.firemuffin.lost_pages.core.Lostpages;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Banana extends Item {
	public Banana() {
		super(new Item.Properties()
				.group(Lostpages.LOSTPAGES)
				.food(new Food.Builder()
					.hunger(4)
					.saturation(2.4f)
					.build())
		);
		
	}

}
