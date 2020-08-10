package com.firemuffin.lost_pages.blocks;

import com.firemuffin.lost_pages.Lostpages;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class LP_Block extends BlockItem {
    public LP_Block(Block block) {
        super(block, new Item.Properties().group(Lostpages.Blocks));
    }
}
