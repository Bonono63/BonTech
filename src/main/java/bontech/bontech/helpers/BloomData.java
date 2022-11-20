package bontech.bontech.helpers;

import net.minecraft.util.math.BlockPos;

public class BloomData {

    public double x;
    public double y;
    public double z;

    public BloomData(BlockPos pos)
    {
        this.x = pos.getX();
        this.y = pos.getY();
        this.z = pos.getZ();
    }

    public BlockPos getBlockPos()
    {
        return new BlockPos(x, y, z);
    }
}
