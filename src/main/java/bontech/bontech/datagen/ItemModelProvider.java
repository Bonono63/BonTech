package bontech.bontech.datagen;

import bontech.bontech.BonTech;
import bontech.bontech.config.Config;
import bontech.bontech.materials.Material;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemModelProvider extends FabricModelProvider {
    public ItemModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        BonTech.LOGGER.info("Generating Models");
        Config config = BonTech.CONFIG;

        for ( Material material : config.getMaterials() ) {
            BonTech.LOGGER.info(material.toString());
                    itemModelGenerator.register(Registry.ITEM.get(new Identifier(BonTech.MOD_ID, material.id)), Registry.ITEM.get(new Identifier(BonTech.MOD_ID, material.id)).asItem(), Models.GENERATED);
        }
    }
}
