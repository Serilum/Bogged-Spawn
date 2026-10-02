package com.serilum.boggedspawn;

import com.natamus.collective.objects.SAMObject;
import com.serilum.boggedspawn.config.ConfigHandler;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.item.Items;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		new SAMObject(EntityTypes.SKELETON, EntityTypes.BOGGED, Items.BOW, ConfigHandler.chanceSkeletonIsBogged, false, false, false);
	}
}