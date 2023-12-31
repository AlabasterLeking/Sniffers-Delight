package alabaster.sniffersdelight.common.block;

import alabaster.sniffersdelight.common.registry.ModBlocks;
import alabaster.sniffersdelight.common.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FrostbloomBlock extends CropBlock
{
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D)
    };

    public FrostbloomBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return ModBlocks.FROSTBLOOM_CROP.get().defaultBlockState();
    }

    @Override
    protected boolean mayPlaceOn(BlockState blockState, BlockGetter level, BlockPos pos) {
        return blockState.is(Blocks.SNOW_BLOCK);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.FROSTBLOOM_SEEDS.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_AGE[state.getValue(this.getAgeProperty())];
    }
}
