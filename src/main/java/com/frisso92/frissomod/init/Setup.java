package com.frisso92.frissomod.init;

import com.frisso92.frissomod.FrissoMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class Setup {
    public static final String TAB_NAME = "tutorialv3";

    public static void init(FMLClientSetupEvent event) {

    }
    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };

    public static final TagKey<Item> TUNGSTEN_ORE_ITEM = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(FrissoMod.MOD_ID, "tungsten_ore"));
}