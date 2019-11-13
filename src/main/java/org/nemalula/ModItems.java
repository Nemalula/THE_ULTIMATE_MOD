package org.nemalula;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static ItemBase ingotCooper = new ItemBase("ingot_cooper").setCreativeTab(CreativeTabs.MATERIALS);
    /*public static ItemBase ingotAnt = new ItemBase("ingot_ant").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotSteal = new ItemBase("ingot_steal").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotWood = new ItemBase("ingot_wood").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotDemand = new ItemBase("ingot_demand").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotDirt = new ItemBase("ingot_dirt").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotThing = new ItemBase("ingot_thing").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotThang = new ItemBase("ingot_thang").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotThung = new ItemBase("ingot_thung").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotTheng = new ItemBase("ingot_theng").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotThong = new ItemBase("ingot_thong").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotIngot = new ItemBase("ingot_ingot").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemB ase ingotMeme = new ItemBase("ingot_meme").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotWhomst = new ItemBase("ingot_whomst").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotCool = new ItemBase("ingot_cool").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotHot = new ItemBase("ingot_hot").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotNothing = new ItemBase("ingot_nothing").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotStone = new ItemBase("ingot_stone").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotRedstone = new ItemBase("ingot_redstone").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotLapiz = new ItemBase("ingot_lapiz").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotEverything = new ItemBase("ingot_everything").setCreativeTab(CreativeTabs.MATERIALS);*/

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCooper/*,
                ingotAnt,
                ingotSteal,
                ingotWood,
                ingotDemand,
                ingotDirt,
                ingotThing,
                ingotThang,
                ingotThung,
                ingotTheng,
                ingotThong,
                ingotIngot,
                ingotMeme,
                ingotWhomst,
                ingotCool,
                ingotHot,
                ingotNothing,
                ingotStone,
                ingotRedstone,
                ingotLapiz,
                ingotEverything*/
        );
    }

    public static void registerModels() {
        ingotCooper.registerItemModel();

        /*ingotAnt.registerItemModel();
        ingotSteal.registerItemModel();
        ingotWood.registerItemModel();
        ingotDemand.registerItemModel();
        ingotDirt.registerItemModel();
        ingotThing.registerItemModel();
        ingotThang.registerItemModel();
        ingotThung.registerItemModel();
        ingotTheng.registerItemModel();
        ingotThong.registerItemModel();
        ingotIngot.registerItemModel();
        ingotMeme.registerItemModel();
        ingotWhomst.registerItemModel();
        ingotCool.registerItemModel();
        ingotHot.registerItemModel();
        ingotNothing.registerItemModel();
        ingotStone.registerItemModel();
        ingotRedstone.registerItemModel();
        ingotLapiz.registerItemModel();
        ingotEverything.registerItemModel();*/
    }


}
