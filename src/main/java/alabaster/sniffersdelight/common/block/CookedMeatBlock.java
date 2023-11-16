package alabaster.sniffersdelight.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.function.Supplier;

public class CookedMeatBlock extends FeastBlock
{
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    protected static final VoxelShape BONE_SHAPE = Block.box(6.0D, 6.D, 0.0D, 10.0D, 10.0D, 16.0D);
    protected static final VoxelShape MEAT_SHAPE = Shapes.joinUnoptimized(BONE_SHAPE, Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), BooleanOp.OR);

    public CookedMeatBlock(Properties properties, Supplier<Item> servingItem, boolean hasLeftovers) {
        super(properties, servingItem, hasLeftovers);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(SERVINGS) == 0 ? BONE_SHAPE : MEAT_SHAPE;
    }
}
