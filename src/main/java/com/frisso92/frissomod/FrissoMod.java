package com.frisso92.frissomod;

import com.frisso92.frissomod.init.ModBlocks;
import com.frisso92.frissomod.init.ModItems;
import com.frisso92.frissomod.init.Setup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(FrissoMod.MOD_ID)
public class FrissoMod {
    public static final Logger LOGGER = LogManager.getLogger("frissomod");
    public static final String MOD_ID = "frissomod";

    public FrissoMod() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);

        bus.addListener(Setup::init);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
    }
}
