package com.natamus.wooltweaks;

import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.fabric.callbacks.CollectiveBlockEvents;
import com.natamus.wooltweaks.events.WoolClickEvent;
import com.natamus.wooltweaks.util.Reference;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		CollectiveBlockEvents.BLOCK_RIGHT_CLICK.register((world, player, hand, pos, hitVec) -> {
			return WoolClickEvent.onWoolClick(world, player, hand, pos, hitVec);
		});
	}

	private static void setGlobalConstants() {

	}
}
