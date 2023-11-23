package alabaster.sniffersdelight.common.registry;

import alabaster.sniffersdelight.SniffersDelight;
import alabaster.sniffersdelight.common.block.CookedMeatBlock;
import alabaster.sniffersdelight.common.block.FrostbloomBlock;
import alabaster.sniffersdelight.common.block.MeatBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SniffersDelight.MODID);

    // Food Storage
    public static final RegistryObject<Block> MEAT_BLOCK = BLOCKS.register("meat_block",
            () -> new MeatBlock(Block.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(2.0F, 3.0F).sound(SoundType.SLIME_BLOCK)));

    public static final RegistryObject<Block> COOKED_MEAT_BLOCK = BLOCKS.register("cooked_meat_block",
            () -> new CookedMeatBlock(Block.Properties.copy(Blocks.NETHER_WART_BLOCK), ModItems.COOKED_MEAT_BLOCK, true));

    // Crops
    public static final RegistryObject<Block> FROSTBLOOM_BLOCK = BLOCKS.register("frostbloom",
            () -> new FrostbloomBlock(Block.Properties.copy(Blocks.POPPY)));

//    public static final RegistryObject<Block> IRONSHROOM_BLOCK = BLOCKS.register("ironshroom",
//            () -> new IronShroomBlock(Block.Properties.copy(Blocks.RED_MUSHROOM)));
}