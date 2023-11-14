package alabaster.sniffersdelight.common.registry;

import alabaster.sniffersdelight.SniffersDelight;
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

}