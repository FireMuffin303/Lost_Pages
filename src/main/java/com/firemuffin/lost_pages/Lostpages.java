package com.firemuffin.lost_pages;

import com.firemuffin.lost_pages.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("lostpages")
public class Lostpages
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static  final String MOD_ID = "lostpages";

    public Lostpages() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    //blocks tab
    public static  final  ItemGroup Blocks = new ItemGroup("lp_block") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ENCHANTED_CRAFTING_TABLE_ITEM.get());
        }
    };

    //meterials
    public static final ItemGroup METERIAL = new ItemGroup("lp_meterials") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ETERNAL_INGOT.get());
        }
    };

    //foods
    public static final ItemGroup FOOD = new ItemGroup("lp_food") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.BANANA.get());
        }
    };

}
