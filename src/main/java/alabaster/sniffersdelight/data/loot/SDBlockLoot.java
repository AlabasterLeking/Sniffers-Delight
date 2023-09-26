package alabaster.sniffersdelight.data.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import net.minecraft.world.level.storage.loot.LootTable;
import alabaster.sniffersdelight.common.registry.ModBlocks;

import java.util.HashSet;
import java.util.Set;

public class SDBlockLoot extends BlockLootSubProvider
{
    private final Set<Block> generatedLootTables = new HashSet<>();

    public SDBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
    }

    @Override
    protected void add(Block block, LootTable.Builder builder) {
        this.generatedLootTables.add(block);
        this.map.put(block.getLootTable(), builder);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return generatedLootTables;
    }
}