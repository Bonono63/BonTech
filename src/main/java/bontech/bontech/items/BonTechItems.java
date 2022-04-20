package bontech.bontech.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import bontech.bontech.BonTech;

public class BonTechItems {

    //public static final Item BEAN = register("bean", new Item(newSettings()));

    // MISC

    //FOOD

    //MATERIALS

    public static final Item WROUGHT_IRON_CRUCIBLE = register("wrought_iron_crucible", new Item(newSettings()));
    public static final Item WROUGHT_IRON_INGOT = register("wrought_iron_ingot", new Item(newSettings()));
    public static final Item WROUGHT_IRON_GEAR = register("wrought_iron_gear", new Item(newSettings()));
    public static final Item WROUGHT_IRON_SHAFT = register("wrought_iron_shaft", new Item(newSettings()));

    public static final Item PIG_IRON_INGOT = register("pig_iron_ingot", new Item(newSettings()));
    public static final Item STEEL_INGOT = register("steel_ingot", new Item(newSettings()));

    public BonTechItems(){}

    public static void init(){}

    static Item.Settings newSettings() {
        return new Item.Settings().group(ItemGroup.MISC);
    }

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, BonTech.identifier(name),item);
    }
}
