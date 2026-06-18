package com.natamus.wooltweaks.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;

public class Util {
    public static HashMap<Item, Block> woolblocks = new HashMap<>();
    public static HashMap<Item, Block> bedblocks = new HashMap<>();
    public static HashMap<Item, Block> carpetblocks = new HashMap<>();

    public static void initiateColourMaps() {
       woolblocks.put(Items.DYE.black(), Blocks.WOOL.black());
       woolblocks.put(Items.DYE.blue(), Blocks.WOOL.blue());
       woolblocks.put(Items.DYE.brown(), Blocks.WOOL.brown());
       woolblocks.put(Items.DYE.cyan(), Blocks.WOOL.cyan());
       woolblocks.put(Items.DYE.gray(), Blocks.WOOL.gray());
       woolblocks.put(Items.DYE.green(), Blocks.WOOL.green());
       woolblocks.put(Items.DYE.lightBlue(), Blocks.WOOL.lightBlue());
       woolblocks.put(Items.DYE.lightGray(), Blocks.WOOL.lightGray());
       woolblocks.put(Items.DYE.lime(), Blocks.WOOL.lime());
       woolblocks.put(Items.DYE.magenta(), Blocks.WOOL.magenta());
       woolblocks.put(Items.DYE.orange(), Blocks.WOOL.orange());
       woolblocks.put(Items.DYE.pink(), Blocks.WOOL.pink());
       woolblocks.put(Items.DYE.purple(), Blocks.WOOL.purple());
       woolblocks.put(Items.DYE.red(), Blocks.WOOL.red());
       woolblocks.put(Items.DYE.yellow(), Blocks.WOOL.yellow());
       woolblocks.put(Items.DYE.white(), Blocks.WOOL.white());

       bedblocks.put(Items.DYE.black(), Blocks.BED.black());
       bedblocks.put(Items.DYE.blue(), Blocks.BED.blue());
       bedblocks.put(Items.DYE.brown(), Blocks.BED.brown());
       bedblocks.put(Items.DYE.cyan(), Blocks.BED.cyan());
       bedblocks.put(Items.DYE.gray(), Blocks.BED.gray());
       bedblocks.put(Items.DYE.green(), Blocks.BED.green());
       bedblocks.put(Items.DYE.lightBlue(), Blocks.BED.lightBlue());
       bedblocks.put(Items.DYE.lightGray(), Blocks.BED.lightGray());
       bedblocks.put(Items.DYE.lime(), Blocks.BED.lime());
       bedblocks.put(Items.DYE.magenta(), Blocks.BED.magenta());
       bedblocks.put(Items.DYE.orange(), Blocks.BED.orange());
       bedblocks.put(Items.DYE.pink(), Blocks.BED.pink());
       bedblocks.put(Items.DYE.purple(), Blocks.BED.purple());
       bedblocks.put(Items.DYE.red(), Blocks.BED.red());
       bedblocks.put(Items.DYE.yellow(), Blocks.BED.yellow());
       bedblocks.put(Items.DYE.white(), Blocks.BED.white());

       carpetblocks.put(Items.DYE.black(), Blocks.CARPET.black());
       carpetblocks.put(Items.DYE.blue(), Blocks.CARPET.blue());
       carpetblocks.put(Items.DYE.brown(), Blocks.CARPET.brown());
       carpetblocks.put(Items.DYE.cyan(), Blocks.CARPET.cyan());
       carpetblocks.put(Items.DYE.gray(), Blocks.CARPET.gray());
       carpetblocks.put(Items.DYE.green(), Blocks.CARPET.green());
       carpetblocks.put(Items.DYE.lightBlue(), Blocks.CARPET.lightBlue());
       carpetblocks.put(Items.DYE.lightGray(), Blocks.CARPET.lightGray());
       carpetblocks.put(Items.DYE.lime(), Blocks.CARPET.lime());
       carpetblocks.put(Items.DYE.magenta(), Blocks.CARPET.magenta());
       carpetblocks.put(Items.DYE.orange(), Blocks.CARPET.orange());
       carpetblocks.put(Items.DYE.pink(), Blocks.CARPET.pink());
       carpetblocks.put(Items.DYE.purple(), Blocks.CARPET.purple());
       carpetblocks.put(Items.DYE.red(), Blocks.CARPET.red());
       carpetblocks.put(Items.DYE.yellow(), Blocks.CARPET.yellow());
       carpetblocks.put(Items.DYE.white(), Blocks.CARPET.white());
    }
}