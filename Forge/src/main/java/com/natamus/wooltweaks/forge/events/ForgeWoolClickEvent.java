package com.natamus.wooltweaks.forge.events;

import com.natamus.wooltweaks.events.WoolClickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeWoolClickEvent {
	@SubscribeEvent
	public void onWoolClick(PlayerInteractEvent.RightClickBlock e) {
		WoolClickEvent.onWoolClick(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec());
	}
}