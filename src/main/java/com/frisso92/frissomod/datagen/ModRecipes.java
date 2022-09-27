package com.frisso92.frissomod.datagen;

import com.frisso92.frissomod.init.ModItems;
import com.frisso92.frissomod.init.Setup;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ModRecipes extends RecipeProvider {
    public ModRecipes(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.TUNGSTER_ORE_ITEM.get()), ModItems.TUNGSTEN_INGOT.get(), 1.0f, 100).unlockedBy("has_ore", has(ModItems.TUNGSTER_ORE_ITEM.get())).save(consumer, "tungsten_ingot1");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_TUNGSTEN.get()), ModItems.TUNGSTEN_INGOT.get(), 1.0f, 100).unlockedBy("has_ore", has(ModItems.RAW_TUNGSTEN.get())).save(consumer, "tungsten_ingot2");

    }
}
