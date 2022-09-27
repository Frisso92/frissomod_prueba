package com.frisso92.frissomod.init;

import com.frisso92.frissomod.FrissoMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS  = DeferredRegister.create(ForgeRegistries.BLOCKS, FrissoMod.MOD_ID);

    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2f)));




    }

