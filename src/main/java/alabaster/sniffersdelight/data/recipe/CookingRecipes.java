package alabaster.sniffersdelight.data.recipe;

import alabaster.sniffersdelight.common.registry.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.function.Consumer;

public class CookingRecipes {
    public static final int FAST_COOKING = 100;      // 5 seconds
    public static final int NORMAL_COOKING = 200;    // 10 seconds
    public static final int SLOW_COOKING = 400;      // 20 seconds

    public static final float SMALL_EXP = 0.35F;
    public static final float MEDIUM_EXP = 1.0F;
    public static final float LARGE_EXP = 2.0F;

    public static void register(Consumer<FinishedRecipe> consumer) {
        cookMeals(consumer);
        cookMinecraftSoups(consumer);
        //cookMiscellaneous(consumer);
    }

    private static void cookMeals(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.FRIED_SNIFFER_EGG.get(), 4, NORMAL_COOKING, SMALL_EXP)
                .addIngredient(Items.SNIFFER_EGG)
                .unlockedByAnyIngredient(Items.SNIFFER_EGG)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GREEN_EGGS_AND_HAM.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(ModItems.FRIED_SNIFFER_EGG.get())
                .addIngredient(Items.COOKED_PORKCHOP)
                .unlockedByAnyIngredient(ModItems.FRIED_SNIFFER_EGG.get(), Items.COOKED_PORKCHOP)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);
    }

    private static void cookMinecraftSoups(Consumer<FinishedRecipe> consumer) {

    }
}

