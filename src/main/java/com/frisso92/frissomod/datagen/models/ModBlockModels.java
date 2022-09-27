package com.frisso92.frissomod.datagen.models;

import com.frisso92.frissomod.FrissoMod;
import com.frisso92.frissomod.init.ModBlocks;
import com.frisso92.frissomod.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;


public class ModBlockModels extends BlockStateProvider {

    public ModBlockModels(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, FrissoMod.MOD_ID, exFileHelper);
    }


    @Override
    protected void registerStatesAndModels() {

        simpleBlock(ModBlocks.TUNGSTEN_ORE.get());
    }
}

