package bontech.bontech.datagen;

import bontech.bontech.BonTech;
import bontech.bontech.config.Config;
import bontech.bontech.items.BTChemicalElement;
import bontech.bontech.materials.MaterialGroup;
import bontech.bontech.materials.Material;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.List;

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

        List<MaterialGroup> groups = config.getMaterialGroups();
        for ( MaterialGroup group : groups ) {
            for ( String type : group.getTypes()) {
                for ( Material material : group.getMaterials() ) {
                    BonTech.LOGGER.info(material.toString());
                    itemModelGenerator.register(Registry.ITEM.get(new Identifier(BonTech.MOD_ID, material.id+"_"+type)), Registry.ITEM.get(new Identifier("bontech", type)).asItem(), Models.GENERATED);
                }
            }
        }
    }
}
