package bontech.bontech.items;

import bontech.bontech.items.groups.BonTechItemGroups;
import bontech.bontech.materials.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import bontech.bontech.BonTech;

public class BonTechItems {

    //₀₁₂₃₄₅₆₇₈₉₊₋⁰¹²³⁴⁵⁶⁷⁸⁹⁺⁻AaBbCcDdEeFfGgHhJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz
    //public static final Item BEAN = register("bean", new Item(newSettings()));

    // MISC

    //FOOD

    //MATERIALS

    public static final Material[] metals = {
            //                      Display Name        id        density  in g per cm^3  tensile strength melting point boiling point
            new Material("Lithium", "lithium", "Li", 0.5350f, 10, 10, 10),
            new Material("Beryllium", "beryllium", "Be", 1.848f, 10, 10, 10),
            new Material("Sodium", "sodium", "Na", 1.848f, 10, 10, 10),
            new Material("Magnesium", "magnesium", "Mg", 1.848f, 10, 10, 10),
            new Material("Aluminum", "aluminum", "Al", 1.848f, 10, 10, 10),
            new Material("Potassium", "potassium", "k", 1.848f, 10, 10, 10),
            new Material("Calcium", "calcium", "Ca", 1.848f, 10, 10, 10),
            new Material("Titanium", "titanium", "Ti", 10, 10, 10, 10),
            new Material("Chromium", "chromium", "Cr", 10, 10, 10, 10),
            new Material("Manganese", "manganese", "Mg", 10, 10, 10, 10),
            new Material("Iron", "iron", "Fe", 10, 10, 10, 10),
            new Material("Cobalt", "cobalt", "Co", 10, 10, 10, 10),
            new Material("Nickel", "nickel", "Ni", 10, 10, 10, 10),
            new Material("Copper", "copper", "Cu", 10, 10, 10, 10),
            new Material("Zinc", "zinc", "Zn", 10, 10, 10, 10),
            new Material("Gallium", "gallium", "Ga", 10, 10, 10, 10),
            new Material("Strontium", "strontium", "Sr", 10, 10, 10, 10),
            new Material("Silver", "silver", "Ag", 10, 10, 10, 10),
            new Material("Tin", "tin", "Sn", 10, 10, 10, 10),
            new Material("Tungsten", "tungsten", "W", 10, 10, 10, 10),
            new Material("Osmium", "osmium", "Os", 10, 10, 10, 10),
            new Material("Iridium", "iridium", "Ir", 10, 10, 10, 10),
            new Material("Platinum", "platinum", "Pt", 10, 10, 10, 10),
            new Material("Gold", "gold", "Au", 10, 10, 10, 10),
            new Material("Mercury", "mercury", "Hg", 10, 10, 10, 10),
            new Material("Lead", "lead", "Pb", 10, 10, 10, 10),
            new Material("Bismuth", "bismuth", "Bi", 10, 10, 10, 10),
            new Material("Neodymium", "neodymium", "Nd", 10, 10, 10, 10),
            new Material("Thorium", "thorium", "Th", 10, 10, 10, 10),
            new Material("Uranium", "uranium", "U", 10, 10, 10, 10),
            new Material("Plutonium", "plutonium", "Pu", 10, 10, 10, 10),
    };

    public static final Material[] non_metals = {
            //                      Display Name        id        density  in g per cm^3  tensile strength melting point boiling point
            new Material("Hydrogen", "hydrogen", "H", 0.0899f, 10, 10, 10),
            new Material("Helium", "helium", "He", 0.0899f, 10, 10, 10),
            new Material("Carbon", "carbon", "C", 0.0899f, 10, 10, 10),
            new Material("Nitrogen", "nitrogen", "N", 0.0899f, 10, 10, 10),
            new Material("Oxygen", "oxygen", "O", 0.0899f, 10, 10, 10),
            new Material("Fluorine", "fluorine", "F", 0.0899f, 10, 10, 10),
            new Material("Neon", "neon", "Ne", 0.0899f, 10, 10, 10),
            new Material("Phosphorus", "phosphorus", "P", 0.0899f, 10, 10, 10),
            new Material("Sulfur", "sulfur", "S", 0.0899f, 10, 10, 10),
            new Material("Chlorine", "chlorine", "Cl", 0.0899f, 10, 10, 10),
            new Material("Argon", "argon", "Ar", 0.0899f, 10, 10, 10),
            new Material("Selenium", "selenium", "Se", 0.0899f, 10, 10, 10),
            new Material("Bromine", "bromine", "Br", 0.0899f, 10, 10, 10),
            new Material("Krypton", "krypton", "Kr", 0.0899f, 10, 10, 10),
            new Material("Iodine", "iodine", "I", 0.0899f, 10, 10, 10),
            new Material("Xenon", "xenon", "Xe", 0.0899f, 10, 10, 10),
            new Material("Astatine", "astatine", "At", 0.0899f, 10, 10, 10),
            new Material("Radon", "radon", "Rn", 0.0899f, 10, 10, 10),
    };

    public static final Material[] metalloids = {
            //                      Display Name        id        density  in g per cm^3  tensile strength melting point boiling point
            new Material("Boron", "boron", "B", 0.0899f, 10, 10, 10),
            new Material("Silicon", "silicon", "Si", 0.0899f, 10, 10, 10),
            new Material("Germanium", "germanium", "Ge", 0.0899f, 10, 10, 10),
            new Material("Arsenic", "arsenic", "As", 0.0899f, 10, 10, 10),
            new Material("Antimony", "antimony", "Sb", 0.0899f, 10, 10, 10),
            new Material("Tellurium", "tellurium", "Te", 0.0899f, 10, 10, 10),
            new Material("Polonium", "polonium", "Po", 0.0899f, 10, 10, 10),
    };

    public static final Item WROUGHT_IRON_SHAFT = register("wrought_iron_shaft", new Item(materials()));
    public static final Item GEAR = register("gear", new Item(materials()));
    public static final Item METAL_BLOOM = register("metal_bloom", new Item(materials()));

    public BonTechItems(){}

    public static void init(){
        //these for loops automatically register ingots and gromps for metal based materials.
        // non-metals and metalloids, ie: hydrogen and helium or silicon and boron, are automatically added as well, but only in pure forms.
        for (int x = 0 ; x < BonTechItems.metals.length ; x++ )
        {
            String temp = BonTechItems.metals[x].id + "_ingot";
            register(temp, new BTIngot(materials(), metals[x].atomic_symbol, 0, 0, 0));
        }
        for (int x = 0 ; x < BonTechItems.metals.length ; x++ )
        {
            String temp = BonTechItems.metals[x].id + "_gromp";
            register(temp, new Item(materials()));
        }
        for (int x = 0 ; x < BonTechItems.metals.length ; x++ )
        {
            String temp = BonTechItems.metals[x].id + "_nugget";
            register(temp, new Item(materials()));
        }
        for (int x = 0 ; x < BonTechItems.non_metals.length ; x++ )
        {
            String temp = BonTechItems.non_metals[x].id;
            register(temp, new Item(materials()));
        }
    }

    static Item.Settings materials() {
        return new Item.Settings().group(BonTechItemGroups.MATERIALS);
    }

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, BonTech.identifier(name),item);
    }
}
