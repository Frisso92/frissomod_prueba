package com.frisso92.frissomod.datagen.tags;

import com.frisso92.frissomod.FrissoMod;
import com.frisso92.frissomod.init.ModBlocks;
import com.frisso92.frissomod.init.ModItems;
import com.frisso92.frissomod.init.Setup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator p_126530_, BlockTagsProvider p_126531_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126530_, p_126531_, FrissoMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(ModItems.TUNGSTER_ORE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(ModItems.TUNGSTEN_INGOT.get());
        tag(Tags.Items.RAW_MATERIALS)
                .add(ModItems.RAW_TUNGSTEN.get());
        tag(Setup.TUNGSTEN_ORE_ITEM)
                .add(ModItems.TUNGSTER_ORE_ITEM.get())
                .add(ModItems.RAW_TUNGSTEN.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
