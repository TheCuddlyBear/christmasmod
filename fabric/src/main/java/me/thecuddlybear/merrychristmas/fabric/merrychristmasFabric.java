package me.thecuddlybear.merrychristmas.fabric;

import me.thecuddlybear.merrychristmas.merrychristmas;
import net.fabricmc.api.ModInitializer;

public class merrychristmasFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        merrychristmas.init();
    }
}