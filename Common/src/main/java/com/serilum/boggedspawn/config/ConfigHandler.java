package com.serilum.boggedspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.serilum.boggedspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceSkeletonIsBogged = 0.1;
	@Entry public static boolean onlySpawnBoggedOnSurface = false;
	@Entry(registry = "dimension") public static String dimensionsToSpawnIn = "";
	@Entry(registry = "worldgen/biome") public static String biomesToSpawnIn = "";

	public static void initConfig() {
		configMetaData.put("chanceSkeletonIsBogged", Arrays.asList(
			"The chance a skeleton that has spawned is of the bogged variant."
		));
		configMetaData.put("onlySpawnBoggedOnSurface", Arrays.asList(
			"When enabled, bogged will only spawn on the surface."
		));
		configMetaData.put("dimensionsToSpawnIn", Arrays.asList(
			"Dimensions in which skeletons can turn into bogged, separated by a comma. Leave empty for every dimension. For example: 'minecraft:overworld,minecraft:the_nether'."
		));
		configMetaData.put("biomesToSpawnIn", Arrays.asList(
			"Biomes in which skeletons can turn into bogged, separated by a comma. Biome tags work too, starting with a '#'. Leave empty for every biome. For example: 'minecraft:swamp,minecraft:mangrove_swamp'."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}