package alabaster.sniffersdelight.common.registry;

import alabaster.sniffersdelight.SniffersDelight;
import alabaster.sniffersdelight.common.utils.SDFoodValues;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.DrinkableItem;

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
    public static final RegistryObject<Item> PEARL = addToTab(ITEMS.register("pearl",
            () -> new Item(basicItem())));

    // Foods
    public static final RegistryObject<Item> RAW_CRAB = addToTab(ITEMS.register("crab",
            () -> new Item(foodItem(SDFoodValues.FRIED_SNIFFER_EGG))));

}