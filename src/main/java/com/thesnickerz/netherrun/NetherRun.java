package com.thesnickerz.netherrun;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherRun implements ModInitializer {
	public static final String MOD_ID = "nether_run";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Nether Run initializing...");
	}
}
