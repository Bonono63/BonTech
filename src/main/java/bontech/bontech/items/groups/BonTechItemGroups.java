package bontech.bontech.items.groups;

import bontech.bontech.BonTech;
import bontech.bontech.blocks.BonTechBlocks;
import bontech.bontech.items.BonTechItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BonTechItemGroups {

    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.create(
                    new Identifier(BonTech.MOD_ID, "materials"))
            .icon(() -> new ItemStack(BonTechItems.PIG_IRON_INGOT))
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(BonTechItems.WROUGHT_IRON_INGOT));
                itemStacks.add(new ItemStack(BonTechItems.WROUGHT_IRON_CRUCIBLE));
                itemStacks.add(new ItemStack(BonTechItems.WROUGHT_IRON_GEAR));
                itemStacks.add(new ItemStack(BonTechItems.WROUGHT_IRON_SHAFT));
                itemStacks.add(new ItemStack(BonTechItems.PIG_IRON_INGOT));
                itemStacks.add(new ItemStack(BonTechItems.STEEL_INGOT));
            })
            .build();

    public static final ItemGroup BLOCKS = FabricItemGroupBuilder.create(
                    new Identifier(BonTech.MOD_ID, "blocks"))
            .icon(() -> new ItemStack(BonTechBlocks.MACHINE_FRAME))
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(BonTechBlocks.MACHINE_FRAME));
                itemStacks.add(new ItemStack(BonTechBlocks.CLAY));
            })
            .build();

    public static void init() {}

    public BonTechItemGroups() {}
}
