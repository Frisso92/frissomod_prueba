package com.frisso92.frissomod.datagen;

import com.frisso92.frissomod.FrissoMod;
import com.frisso92.frissomod.datagen.models.ModBlockModels;
import com.frisso92.frissomod.datagen.models.ModItemModels;
import com.frisso92.frissomod.datagen.tags.ModBlockTagsProvider;
import com.frisso92.frissomod.datagen.tags.ModItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = FrissoMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {

            generator.addProvider(new ModRecipes(generator));
            ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new ModItemTagsProvider(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(new ModBlockModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new ModItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new ModLanguageProvider(generator, "en_us"));
        }
    }
}