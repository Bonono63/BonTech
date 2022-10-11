package bontech.bontech.items.groups;

import bontech.bontech.BonTech;
import bontech.bontech.blocks.BonTechBlocks;
import bontech.bontech.items.BonTechItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;

public class BonTechItemGroups {

    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.create(
                    new Identifier(BonTech.MOD_ID, "materials"))
            .icon(() -> new ItemStack(BonTechItems.GEAR))
            .build();

    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.create(
                    new Identifier(BonTech.MOD_ID, "blocks"))
            .icon(() -> new ItemStack(BonTechBlocks.MACHINE_FRAME))
            .build();

    public static void init() {
    }

    public BonTechItemGroups() {}
}
