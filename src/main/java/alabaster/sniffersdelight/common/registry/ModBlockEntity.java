package alabaster.sniffersdelight.common.registry;

import alabaster.sniffersdelight.SniffersDelight;
import alabaster.sniffersdelight.common.block.entity.MeatBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SniffersDelight.MODID);

    public static final RegistryObject<BlockEntityType<MeatBlockEntity>> MEAT_BLOCK = BLOCK_ENTITY_TYPE.register("meat_block",
            () -> BlockEntityType.Builder.of(MeatBlockEntity::new, new Block[]{ModBlocks.MEAT_BLOCK.get()}).build(null));
}