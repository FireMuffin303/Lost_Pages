package com.firemuffin.lost_pages.util;

import com.firemuffin.lost_pages.Lostpages;
import com.firemuffin.lost_pages.blocks.EnchantedCraftingTable;
import com.firemuffin.lost_pages.blocks.LP_Block;
import com.firemuffin.lost_pages.items.LP_Food;
import com.firemuffin.lost_pages.items.LP_Meterial;
import net.minecraft.block.Block;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lostpages.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lostpages.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items
    public static  final RegistryObject<Item> ETERNAL_INGOT = ITEMS.register("eternal_ingot", LP_Meterial::new);
    public static  final RegistryObject<Item> BANANA = ITEMS.register("banana", LP_Food::new);
    public static  final RegistryObject<Item> GOLDEN_BANANA = ITEMS.register("golden_banana", LP_Food::new);
    public static final RegistryObject<Item> ENDERDRAGON_WING = ITEMS.register("enderdragon_wing",LP_Meterial::new);

    //Blocks
    public static final RegistryObject<Block> ENCHANTED_CRAFTING_TABLE = BLOCKS.register("enchanted_crafting_table", EnchantedCraftingTable::new);

    //block items
    public static  final RegistryObject<Item> ENCHANTED_CRAFTING_TABLE_ITEM = ITEMS.register("enchanted_crafting_table", () -> new LP_Block(ENCHANTED_CRAFTING_TABLE.get()));
}
