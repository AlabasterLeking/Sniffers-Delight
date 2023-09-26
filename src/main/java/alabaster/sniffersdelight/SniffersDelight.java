package alabaster.sniffersdelight;

import alabaster.sniffersdelight.common.Config;
import alabaster.sniffersdelight.common.registry.ModBlocks;
import alabaster.sniffersdelight.common.registry.ModCreativeTabs;
import alabaster.sniffersdelight.common.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;


@Mod(SniffersDelight.MODID)
public class SniffersDelight {
    public static final String MODID = "crabbersdelight";
    public static final Logger LOGGER = LogManager.getLogger();

    public SniffersDelight() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModCreativeTabs.CREATIVE_TAB.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation modPrefix(String path) {
        return new ResourceLocation(SniffersDelight.MODID, path);
    }

    public void gatherData(GatherDataEvent event) {
        boolean includeClient = event.includeClient();
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
    }
}