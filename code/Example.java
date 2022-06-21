/**
 * Example.java
 * This is the "main" class for my fabric mod
 * Yuting Hou - jun 20, 2022
 */
package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.block.ModBlocks;
import net.fabricmc.example.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(Example.mod_id);

	//mod id of this mod
	public static final String mod_id = "modid";

	@Override
	/**
	 * This runs when minecraft starts
	 * Register all mod content here
	 * Register is the process of taking mod items and making it known to minecraft
	 */
	public void onInitialize() {

		//tells Fabric to registers mod items
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}
