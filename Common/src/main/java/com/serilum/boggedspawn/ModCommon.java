package com.serilum.boggedspawn;

import com.natamus.collective.globalcallbacks.ConfigCallback;
import com.natamus.collective.objects.SAMObject;
import com.serilum.boggedspawn.config.ConfigHandler;
import com.serilum.boggedspawn.util.Reference;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.item.Items;

public class ModCommon {
	private static SAMObject samObject;

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		samObject = new SAMObject(EntityTypes.SKELETON, EntityTypes.BOGGED, Items.BOW, ConfigHandler.chanceSkeletonIsBogged, false, false, false, false, false, Integer.MAX_VALUE);

		ConfigCallback.CONFIG_CHANGED.register((String modid) -> {
			if (!modid.equals(Reference.MOD_ID)) {
				return;
			}

			samObject.changeChance = ConfigHandler.chanceSkeletonIsBogged;
		});
	}
}