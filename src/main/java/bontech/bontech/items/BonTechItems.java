package bontech.bontech.items;

import bontech.bontech.config.Config;
import bontech.bontech.materials.MaterialGroup;
import bontech.bontech.items.groups.BonTechItemGroups;
import bontech.bontech.materials.Material;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import bontech.bontech.BonTech;

import java.util.List;

public class BonTechItems {
    //public static final Item BEAN = register("bean", new Item(newSettings()));

    // MISC

    //FOOD

    //MATERIALS

    public static final Item GEAR = register("gear", new Item(new Item.Settings()));
    public static final Item BLOOM = register("bloom", new Item(new Item.Settings()));
    public static final Item INGOT = register("ingot", new Item(new Item.Settings()));
    public static final Item NUGGET = register("nugget", new Item(new Item.Settings()));
    public static final Item SILICA_SAND = register("silica_sand", new Item(materials()));
    public static final Item LIMESTONE_POWDER = register("limestone_powder", new Item(materials()));

    public BonTechItems(){}

    public static void init(){
        BonTech.LOGGER.info("Registering Items");
        Config config = BonTech.CONFIG;

        typeRegister(config);
    }

    public static void typeRegister(Config config)
    {
        List<MaterialGroup> groups = config.getMaterialGroups();
        for ( MaterialGroup group : groups) {
            for (String type : group.getTypes()) {
                for (Material material : group.getMaterials())
                {
                    register(material.id+"_"+type, new BTChemicalElement(materials(), material));
                }
            }
        }
    }

    public static Item.Settings materials() {
        return new Item.Settings().group(BonTechItemGroups.MATERIALS);
    }

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, BonTech.identifier(name),item);
    }
}
