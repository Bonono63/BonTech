package bontech.bontech.fluids;

import bontech.bontech.BonTech;
import bontech.bontech.materials.Material;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class GenericLiquid extends FluidTemplate{

    Material material;
    public GenericLiquid(Material material) {
        this.material = material;
    }

    @Override
    public Fluid getFlowing() {
        return Registry.FLUID.get(BonTech.identifier("flowing_"+material.id));
    }

    @Override
    public Fluid getStill() {
        return Registry.FLUID.get(BonTech.identifier(material.id));
    }

    @Override
    public Item getBucketItem() {
        return Registry.ITEM.get(new Identifier(BonTech.MOD_ID, material.id+"_bucket"));
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return Registry.BLOCK.get(BonTech.identifier(material.id)).getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }

    public static class Flowing extends GenericLiquid {
        public Flowing(Material material) {
            super(material);
        }

        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends GenericLiquid {
        public Still(Material material) {
            super(material);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
