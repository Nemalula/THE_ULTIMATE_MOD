package org.nemalula;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCooper = new BlockOre("ore_cooper").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCooper
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCooper.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCooper.registerItemModel(Item.getItemFromBlock(oreCooper));
    }
}
