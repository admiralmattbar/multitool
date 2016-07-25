package org.educraft.multitool.init;

/**
 * Created by admiralmattbar on 7/24/2016.
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import org.educraft.multitool.itemclasses.ItemMultiTool;

public class ModItems {

    public static Item wood_multitool;

    public static void init() {
        wood_multitool = new ItemMultiTool(ToolMaterial.WOOD);
    }

    public static void register() {
        GameRegistry(wood_multitool);
    }

    public static void registerRenders() {
        registerRender(wood_multitool);
    }

    public static void registerRender() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
