package alabaster.sniffersdelight.common.block.entity;

import alabaster.sniffersdelight.common.registry.ModBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MeatBlockEntity extends BlockEntity {

    private int tickCounter = 0;

    public MeatBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntity.MEAT_BLOCK.get(), pos, state);
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, MeatBlockEntity blockEntity) {

    }
}
