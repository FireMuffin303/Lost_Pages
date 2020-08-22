package com.firemuffin.lost_pages.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class EnchantedCraftingTable extends Block {
    public EnchantedCraftingTable() {
        super(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f,1200.0f).sound(SoundType.STONE).harvestLevel(0).harvestTool(ToolType.PICKAXE));
        }
    
    @Override
	public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if (!world.isRemote) {
			player.openContainer(state.getContainer(world, pos));
			player.addStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
		}
		return ActionResultType.SUCCESS;
	}

    
}
