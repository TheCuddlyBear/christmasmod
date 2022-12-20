package me.thecuddlybear.merrychristmas.forge;

import dev.architectury.platform.forge.EventBuses;
import me.thecuddlybear.merrychristmas.merrychristmas;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(merrychristmas.MOD_ID)
public class merrychristmasForge {
    public merrychristmasForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(merrychristmas.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        merrychristmas.init();
    }
}