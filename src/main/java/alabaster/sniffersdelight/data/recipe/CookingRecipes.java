package alabaster.sniffersdelight.data.recipe;

import net.minecraft.data.recipes.FinishedRecipe;

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

    }

    private static void cookMinecraftSoups(Consumer<FinishedRecipe> consumer) {

    }
}

