package org.nemalula;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.nemalula.proxies.CommonProxy;

@Mod(modid = AntsMod.modId, name = AntsMod.name, version = AntsMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class AntsMod {
    @SidedProxy(serverSide = "org.nemalula.proxies.CommonProxy", clientSide = "org.nemalula.proxies.ClientProxy")
    public static CommonProxy proxy;
    public static final String modId = "nemalula";
    public static final String name = "Ants Mod";
    public static final String version = "69";

    @Mod.Instance(modId)
    public static AntsMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            org.nemalula.ModItems.register(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            ModItems.registerModels();
        }
        }

}