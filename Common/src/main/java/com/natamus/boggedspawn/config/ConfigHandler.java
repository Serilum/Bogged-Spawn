package com.natamus.boggedspawn.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.boggedspawn.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double chanceSkeletonIsBogged = 0.1;

	public static void initConfig() {
		configMetaData.put("chanceSkeletonIsBogged", Arrays.asList(
			"The chance a skeleton that has spawned is of the bogged variant."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}