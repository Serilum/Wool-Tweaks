package com.natamus.wooltweaks.forge.events;

import com.natamus.wooltweaks.events.WoolClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeWoolClickEvent {
	@SubscribeEvent
	public static void onWoolClick(PlayerInteractEvent.RightClickBlock e) {
		WoolClickEvent.onWoolClick(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}