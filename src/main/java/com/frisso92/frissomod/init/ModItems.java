package com.frisso92.frissomod.init;

import com.frisso92.frissomod.FrissoMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(Setup.ITEM_GROUP);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FrissoMod.MOD_ID);


    public static final RegistryObject<BlockItem> TUNGSTER_ORE_ITEM = fromBlock(ModBlocks.TUNGSTEN_ORE);
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties().tab(Setup.ITEM_GROUP)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties().tab(Setup.ITEM_GROUP)));

    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<BlockItem> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
