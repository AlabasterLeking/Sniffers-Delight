package alabaster.sniffersdelight.common.block.entity;

import alabaster.sniffersdelight.Config;
import alabaster.sniffersdelight.SniffersDelight;
import alabaster.sniffersdelight.common.registry.ModBlockEntity;
import alabaster.sniffersdelight.common.registry.ModBlocks;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import vectorwing.farmersdelight.common.block.entity.HeatableBlockEntity;

import javax.annotation.Nullable;

public class MeatBlockEntity extends BlockEntity implements HeatableBlockEntity {

    private int tickCounter = 0;

    public MeatBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntity.MEAT_BLOCK.get(), pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putInt("tickCounter", tickCounter);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.tickCounter = tag.getInt("tickCounter");
    }

    @Nullable
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public boolean isHeated() {
        if (level == null) return false;
        return this.isHeated(level, worldPosition);
    }

    public static Pair<Integer, Integer> getMinMax() {
        return Pair.of(Config.MIN_TICKS.get(), Config.MAX_TICKS.get());
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, MeatBlockEntity meatBlockEntity) {
        RandomSource random = level.getRandom();

        if (getMinMax().getSecond() > getMinMax().getFirst()) {
            if (meatBlockEntity.tickCounter >= random.nextIntBetweenInclusive(getMinMax().getFirst(), getMinMax().getSecond())) {
                meatBlockEntity.tickCounter = 0;
                if (meatBlockEntity.isHeated()) {
                    level.setBlock(pos, ModBlocks.COOKED_MEAT_BLOCK.get().withPropertiesOf(meatBlockEntity.getBlockState()), 3);
                }
            } else {
                meatBlockEntity.tickCounter++;
            }
        }
    }
}

