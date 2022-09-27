package com.frisso92.frissomod.datagen;

import com.frisso92.frissomod.FrissoMod;
import com.frisso92.frissomod.init.ModBlocks;
import com.frisso92.frissomod.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, FrissoMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + FrissoMod.MOD_ID, "Frisso Mod");

        add(ModBlocks.TUNGSTEN_ORE.get(), "Tungsten Ore");
        add(ModItems.TUNGSTEN_INGOT.get(), "Tungsten Ingot");
        add(ModItems.RAW_TUNGSTEN.get(), "Raw Tungsten");
    }
}
