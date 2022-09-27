package com.frisso92.frissomod.datagen.models;

import com.frisso92.frissomod.FrissoMod;
import com.frisso92.frissomod.init.ModBlocks;
import com.frisso92.frissomod.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModels extends ItemModelProvider {


    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, FrissoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModBlocks.TUNGSTEN_ORE.get().getRegistryName().getPath(), modLoc("block/tungsten_ore"));
        singleTexture(ModItems.RAW_TUNGSTEN.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/raw_tungsten"));
        singleTexture(ModItems.TUNGSTEN_INGOT.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/tungsten_ingot"));

    }
}
