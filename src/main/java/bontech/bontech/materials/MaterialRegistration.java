package bontech.bontech.materials;

import bontech.bontech.BonTech;
import bontech.bontech.config.Config;
import bontech.bontech.fluids.FluidTemplate;
import bontech.bontech.fluids.GenericGas;
import bontech.bontech.fluids.GenericLiquid;
import bontech.bontech.items.BTChemicalElement;
import bontech.bontech.items.BonTechItems;
import bontech.bontech.items.groups.BonTechItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

import java.util.Objects;
import java.util.function.Function;

import static bontech.bontech.BonTech.MOD_ID;
import static bontech.bontech.items.BonTechItems.materials;
import static bontech.bontech.items.BonTechItems.register;

public class MaterialRegistration {

    public static void init() {
        BonTech.LOGGER.info("Registering Items");
        Config config = BonTech.CONFIG;

        typeRegister(config);
    }

    public MaterialRegistration() {
    }

    public static void typeRegister(Config config) {
        for (Material material : config.getMaterials()) {
            if (Objects.equals(material.suffix, "liquid")) {
                liquidRegister(material);
            } else if (Objects.equals(material.suffix, "gas")) {
                gasRegister(material);
            } else {
                register(material.id, new BTChemicalElement(materials(), material));
            }
        }
    }

    public static void liquidRegister(Material material) {
        FlowableFluid STILL = Registry.register(Registry.FLUID, BonTech.identifier(material.id), new GenericLiquid.Still(material));
        FlowableFluid FLOWING = Registry.register(Registry.FLUID, BonTech.identifier("flowing_"+material.id), new GenericLiquid.Flowing(material));
        Item BUCKET = Registry.register(Registry.ITEM, BonTech.identifier(material.id+"_bucket"), new BucketItem(STILL, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(BonTechItemGroups.MATERIALS)));
        Block FLUID_BLOCK = Registry.register(Registry.BLOCK, BonTech.identifier(material.id), new FluidBlock(STILL, FabricBlockSettings.copy(Blocks.WATER)){});
    }

    public static void gasRegister(Material material) {
        FlowableFluid STILL = Registry.register(Registry.FLUID, BonTech.identifier(material.id), new GenericGas.Still(material));
        FlowableFluid FLOWING = Registry.register(Registry.FLUID, BonTech.identifier("flowing_"+material.id), new GenericGas.Flowing(material));
        Item BUCKET = Registry.register(Registry.ITEM, BonTech.identifier(material.id+"_canister"), new BucketItem(STILL, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1).group(BonTechItemGroups.MATERIALS)));
        Block FLUID_BLOCK = Registry.register(Registry.BLOCK, BonTech.identifier(material.id), new FluidBlock(STILL, FabricBlockSettings.copy(Blocks.WATER)){});
    }

    static <T extends Block> T blockRegister(String name, T block, Item.Settings settings) {
        return blockRegister(name, block, new BlockItem(block, settings));
    }

    static <T extends Block> T blockRegister(String name, T block) {
        return blockRegister(name, block, new Item.Settings().group(BonTechItemGroups.BLOCKS));
    }

    static <T extends Block> T blockRegister(String name, T block, Function<T, BlockItem> itemFactory) {
        return blockRegister(name, block, itemFactory.apply(block));
    }

    static <T extends Block> T blockRegister(String name, T block, BlockItem item) {
        T b = Registry.register(Registry.BLOCK, BonTech.identifier(name), block);
        if (item != null) {
            BonTechItems.register(name, item);
        }
        return b;
    }
}
