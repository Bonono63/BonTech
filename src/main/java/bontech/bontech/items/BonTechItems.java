package bontech.bontech.items;

import bontech.bontech.config.Config;
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
    }

    public static Item.Settings materials() {
        return new Item.Settings().group(BonTechItemGroups.MATERIALS);
    }

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, BonTech.identifier(name),item);
    }
}
