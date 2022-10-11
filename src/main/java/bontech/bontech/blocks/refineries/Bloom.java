package bontech.bontech.blocks.refineries;

import bontech.bontech.blocks.entities.BloomBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class Bloom extends Block implements BlockEntityProvider {
    public Bloom(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BloomBlockEntity(pos, state);
    }
}
