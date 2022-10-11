package bontech.bontech.blocks;

import bontech.bontech.BonTech;
import bontech.bontech.blocks.refineries.Bloom;
import bontech.bontech.items.BonTechItems;
import bontech.bontech.items.groups.BonTechItemGroups;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

public class BonTechBlocks {

    public static final Block MACHINE_FRAME = register("machine_frame", new MachineFrame(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));

    public static final Block CLAY = register("clay", new Block(FabricBlockSettings.copy(Blocks.CLAY)));
    public static final Block BLOOM = register("bloom", new Bloom(FabricBlockSettings.copy(Blocks.CLAY)));

    public BonTechBlocks()
    {}

    public static void init()
    {}

    static <T extends Block> T register(String name, T block, Item.Settings settings) {
        return register(name, block, new BlockItem(block, settings));
    }

    static <T extends Block> T register(String name, T block) {
        return register(name, block, new Item.Settings().group(BonTechItemGroups.BLOCKS));
    }

    static <T extends Block> T register(String name, T block, Function<T, BlockItem> itemFactory) {
        return register(name, block, itemFactory.apply(block));
    }

    static <T extends Block> T register(String name, T block, BlockItem item) {
        T b = Registry.register(Registry.BLOCK, BonTech.identifier(name), block);
        if (item != null) {
            BonTechItems.register(name, item);
        }
        return b;
    }
}
