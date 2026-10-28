package com.serilum.wooltweaks.neoforge.events;

import com.serilum.wooltweaks.events.WoolClickEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeWoolClickEvent {
	@SubscribeEvent
	public static void onWoolClick(PlayerInteractEvent.RightClickBlock e) {
		WoolClickEvent.onWoolClick(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}