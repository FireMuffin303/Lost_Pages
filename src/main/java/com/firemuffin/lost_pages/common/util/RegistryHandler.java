package com.firemuffin.lost_pages.common.util;

import com.firemuffin.lost_pages.common.block.EnchantedCraftingTable;
import com.firemuffin.lost_pages.common.block.LP_Block;
import com.firemuffin.lost_pages.common.item.LP_Material;
import com.firemuffin.lost_pages.common.item.food.Banana;
import com.firemuffin.lost_pages.common.item.food.Ganana;
import com.firemuffin.lost_pages.common.item.food.MilkBottle;
import com.firemuffin.lost_pages.core.Lostpages;

import net.minecraft.block.Block;
//import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
//import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lostpages.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lostpages.MOD_ID);
    //public static DeferredRegister<ContainerType<?>> CONTAINER_TYPE = DeferredRegister.create(ForgeRegistries.CONTAINERS, Lostpages.MOD_ID);
    
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items
    public static  final RegistryObject<Item> ETERNAL_INGOT = ITEMS.register("eternal_ingot", LP_Material::new);
    public static  final RegistryObject<Banana> BANANA = ITEMS.register("banana", Banana::new);
    public static  final RegistryObject<Ganana> GOLDEN_BANANA = ITEMS.register("golden_banana", Ganana::new);
    public static final RegistryObject<Item> ENDERDRAGON_WING = ITEMS.register("enderdragon_wing",LP_Material::new);
    public static final RegistryObject<MilkBottle> MILK_BOTTLE = ITEMS.register("milk_bottle", MilkBottle::new);

    //Blocks
    public static final RegistryObject<Block> ENCHANTED_CRAFTING_TABLE = BLOCKS.register("enchanted_crafting_table", EnchantedCraftingTable::new);

    //block items
    public static  final RegistryObject<Item> ENCHANTED_CRAFTING_TABLE_ITEM = ITEMS.register("enchanted_crafting_table", () -> new LP_Block(ENCHANTED_CRAFTING_TABLE.get()));
    
    
    
}
