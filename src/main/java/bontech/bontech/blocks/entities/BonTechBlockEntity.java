package bontech.bontech.blocks.entities;

import bontech.bontech.BonTech;
import bontech.bontech.blocks.BonTechBlocks;
import bontech.bontech.blocks.refineries.Bloom;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BonTechBlockEntity {

    public static final BlockEntityType<BloomBlockEntity> BLOOM_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
            new Identifier(BonTech.MOD_ID, "bloom_block_entity"),
            FabricBlockEntityTypeBuilder.create(BloomBlockEntity::new, BonTechBlocks.BLOOMERY).build()
    );

    public BonTechBlockEntity(){}

    public static void init(){

    }
}
