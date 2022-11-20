package bontech.bontech.blocks.entities;

import bontech.bontech.helpers.BloomData;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class BloomBlockEntity extends BlockEntity implements ImplementedInventory{

    private DefaultedList<ItemStack> items = DefaultedList.ofSize(2, ItemStack.EMPTY);

    //measured in kelvin
    public float internal_temp;
    public BloomBlockEntity(BlockPos pos, BlockState state) {
        super(BonTechBlockEntity.BLOOM_BLOCK_ENTITY, pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, items);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, items);
        super.writeNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, BloomBlockEntity type)
    {
        //printing the items above the block
        System.out.println(getAvailableItems(world, new BloomData(pos)));
    }


    public static Box getCollectionZone(BlockPos pos)
    {
        // make a box of space directly above the block and return it.
        return new Box(pos.getX()-0.5, pos.getY()+0.5, pos.getZ()-0.5, pos.getX()+0.5, pos.getY()+1.5, pos.getZ()+0.5);
    }

    public static List<ItemEntity> getAvailableItems(World world, BloomData data)
    {
        // gets the items above the block using getCollectZone()
        return new ArrayList<>(world.getEntitiesByClass(ItemEntity.class, getCollectionZone(data.getBlockPos()), EntityPredicates.VALID_ENTITY));
    }

    public static void transfer()
    {

    }
}
