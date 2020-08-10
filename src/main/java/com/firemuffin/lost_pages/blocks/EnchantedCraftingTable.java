package com.firemuffin.lost_pages.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ActionResultType;
import net.minecraftforge.common.ToolType;

public class EnchantedCraftingTable extends Block {
    public EnchantedCraftingTable() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
