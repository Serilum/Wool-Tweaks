package com.natamus.wooltweaks;


import com.natamus.wooltweaks.util.Util;

public class ModCommon {

	public static void init() {
		load();
	}

	private static void load() {
    	Util.initiateColourMaps();
	}
}