package com.natamus.wooltweaks.forge.events;

import com.natamus.wooltweaks.events.WoolClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeWoolClickEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeWoolClickEvent.class);

		PlayerInteractEvent.RightClickBlock.BUS.addListener(ForgeWoolClickEvent::onWoolClick);
	}

	@SubscribeEvent
	public static void onWoolClick(PlayerInteractEvent.RightClickBlock e) {
		WoolClickEvent.onWoolClick(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}