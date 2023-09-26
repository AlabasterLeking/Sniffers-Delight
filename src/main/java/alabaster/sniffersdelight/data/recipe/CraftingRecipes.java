package alabaster.sniffersdelight.data.recipe;

import net.minecraft.data.recipes.*;
import vectorwing.farmersdelight.common.registry.ModRecipeSerializers;

import java.util.function.Consumer;

public class CraftingRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        recipesBlocks(consumer);
        recipesMaterials(consumer);
        recipesCraftedMeals(consumer);
        SpecialRecipeBuilder.special(ModRecipeSerializers.FOOD_SERVING.get()).save(consumer, "food_serving");
    }

    private static void recipesBlocks(Consumer<FinishedRecipe> consumer) {

    }

    private static void recipesMaterials(Consumer<FinishedRecipe> consumer) {

    }

    private static void recipesCraftedMeals(Consumer<FinishedRecipe> consumer) {

    }
}