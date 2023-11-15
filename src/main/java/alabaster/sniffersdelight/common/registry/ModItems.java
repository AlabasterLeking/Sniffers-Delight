package alabaster.sniffersdelight.common.registry;

import alabaster.sniffersdelight.SniffersDelight;
import alabaster.sniffersdelight.common.utils.SDFoodValues;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static alabaster.sniffersdelight.common.registry.ModCreativeTabs.addToTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SniffersDelight.MODID);

    // Basic Items
    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    // Foods
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    // Drinks
    public static Item.Properties drinkItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    // Materials
    public static final RegistryObject<Item> CHEF_POTTERY_SHERD = addToTab(ITEMS.register("chef_pottery_sherd",
            () -> new Item(basicItem())));

    // Foods
    public static final RegistryObject<Item> FRIED_SNIFFER_EGG = addToTab(ITEMS.register("fried_sniffer_egg",
            () -> new Item(foodItem(SDFoodValues.FRIED_SNIFFER_EGG))));

    public static final RegistryObject<Item> SNIFFER_MOSS = addToTab(ITEMS.register("sniffer_moss",
            () -> new Item(foodItem(SDFoodValues.SNIFFER_MOSS))));

    public static final RegistryObject<Item> GREEN_EGGS_AND_HAM = addToTab(ITEMS.register("green_eggs_and_ham",
            () -> new Item(foodItem(SDFoodValues.GREEN_EGGS_AND_HAM))));

    // Storage Blocks
    public static final RegistryObject<Item> MEAT_BLOCK = addToTab(ITEMS.register("meat_block",
            () -> new BlockItem(ModBlocks.MEAT_BLOCK.get(), basicItem())));

    public static final RegistryObject<Item> COOKED_MEAT_BLOCK = addToTab(ITEMS.register("cooked_meat_block",
            () -> new BlockItem(ModBlocks.COOKED_MEAT_BLOCK.get(), basicItem())));
}
