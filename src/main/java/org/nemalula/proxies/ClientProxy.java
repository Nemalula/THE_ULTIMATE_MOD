package org.nemalula.proxies;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import org.nemalula.AntsMod;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(AntsMod.modId + ":" + id, "inventory"));
        // test change
    }
}
