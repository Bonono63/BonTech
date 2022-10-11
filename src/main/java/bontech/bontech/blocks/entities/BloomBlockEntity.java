package bontech.bontech.blocks.entities;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class BloomBlockEntity extends BlockEntity {
    public BloomBlockEntity(BlockPos pos, BlockState state) {
        super(BonTechBlockEntity.BLOOM_BLOCK_ENTITY, pos, state);
    }


}
