package com.natamus.boggedspawn;

import com.natamus.collective.objects.SAMObject;
import com.natamus.boggedspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityType.SKELETON, EntityType.BOGGED, Items.BOW, ConfigHandler.chanceSkeletonIsBogged, false, false, false);
	}
}