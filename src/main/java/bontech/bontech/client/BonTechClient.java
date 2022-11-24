package bontech.bontech.client;

import bontech.bontech.BonTech;
import bontech.bontech.blocks.BonTechBlocks;
import bontech.bontech.config.Config;
import bontech.bontech.materials.MaterialGroup;
import bontech.bontech.materials.Material;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class BonTechClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BonTech.LOGGER.info("Registering Color Providers");
        Config config = BonTech.CONFIG;
        for (MaterialGroup group : config.getMaterialGroups() ) {
            for (String type : group.getTypes()) {
                for ( Material material : group.getMaterials()) {
                    ColorProviderRegistry.ITEM.register((stack, tintIndex) -> material.color, Registry.ITEM.get(new Identifier(BonTech.MOD_ID, material.id+"_"+type)));
                }
            }
        }

        BlockRenderLayerMap.INSTANCE.putBlock(BonTechBlocks.MACHINE_FRAME, RenderLayer.getCutout());
    }
}
