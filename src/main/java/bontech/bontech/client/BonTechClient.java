package bontech.bontech.client;

import bontech.bontech.BonTech;
import bontech.bontech.blocks.BonTechBlocks;
import bontech.bontech.config.Config;
import bontech.bontech.materials.Material;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Objects;

@Environment(EnvType.CLIENT)
public class BonTechClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BonTech.LOGGER.info("Registering Color Providers");
        Config config = BonTech.CONFIG;
        for ( Material material : config.getMaterials()) {
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> material.color, Registry.ITEM.get(new Identifier(BonTech.MOD_ID, material.id)));

            if (Objects.equals(material.suffix, "liquid") || Objects.equals(material.suffix, "gas")) {
                FluidRenderHandlerRegistry.INSTANCE.register(Registry.FLUID.get(BonTech.identifier(material.id)), Registry.FLUID.get(BonTech.identifier("flowing_"+material.id)), new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        material.color
                ));

                BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), Registry.FLUID.get(BonTech.identifier(material.id)), Registry.FLUID.get(BonTech.identifier("flowing_"+material.id)));
            }
        }

        BlockRenderLayerMap.INSTANCE.putBlock(BonTechBlocks.MACHINE_FRAME, RenderLayer.getCutout());
    }
}
