package com.frisso92.frissomod.datagen.tags;

import com.frisso92.frissomod.FrissoMod;
import com.frisso92.frissomod.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator p_126511_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126511_, FrissoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TUNGSTEN_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TUNGSTEN_ORE.get());
        tag(Tags.Blocks.ORES)
                .add(ModBlocks.TUNGSTEN_ORE.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
