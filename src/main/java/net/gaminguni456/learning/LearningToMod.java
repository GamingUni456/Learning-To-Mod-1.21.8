package net.gaminguni456.learning;

import net.fabricmc.api.ModInitializer;

import net.gaminguni456.learning.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningToMod implements ModInitializer {
	public static final String MOD_ID = "learning_to_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        // Register Items
        ModItems.registerModItems();
	}
}