package alabaster.sniffersdelight.common.registry;

import alabaster.sniffersdelight.SniffersDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = SniffersDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SniffersDelight.MODID);

    public static final List<Supplier<? extends ItemLike>> CREATIVE_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> TAB_SNIFFERS_DELIGHT = CREATIVE_TAB.register("test_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.sniffersdelight"))
                    .icon(Items.SNIFFER_EGG::getDefaultInstance)
                    .displayItems((parameters, output) ->
                            CREATIVE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        CREATIVE_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}