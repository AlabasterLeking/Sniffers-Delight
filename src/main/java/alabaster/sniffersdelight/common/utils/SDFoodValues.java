package alabaster.sniffersdelight.common.utils;

import net.minecraft.world.food.FoodProperties;

public class SDFoodValues {

    // Helper Value Map
    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes

    // Food Items

    public static final FoodProperties FRIED_SNIFFER_EGG = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8f).build();

    public static final FoodProperties SNIFFER_MOSS = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8f).build();

    public static final FoodProperties GREEN_EGGS_AND_HAM = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.8f).build();
}
