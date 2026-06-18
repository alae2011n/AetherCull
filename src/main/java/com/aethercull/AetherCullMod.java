package com.aethercull;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AetherCullMod implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("aethercull");

    @Override
    public void onInitializeClient() {
        LOGGER.info("AetherCull initialized for 1.21.1");
    }
}

