package alabaster.sniffersdelight;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {

    public static ForgeConfigSpec COMMON_CONFIG;

    public static final String CATEGORY_SETTINGS = "settings";
    public static final ForgeConfigSpec.ConfigValue<Integer> MIN_TICKS;
    public static final ForgeConfigSpec.ConfigValue<Integer> MAX_TICKS;


    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COMMON_BUILDER.comment("Game settings").push(CATEGORY_SETTINGS);
        MIN_TICKS = COMMON_BUILDER.comment("Minimum ticks before seafood can be gathered by the crab trap. Default = 4000")
                .define("minTicks", 4000);
        MAX_TICKS = COMMON_BUILDER.comment("Maximum ticks before seafood can be gathered by the crab trap. Default = 8000")
                .define("maxTicks", 8000);

        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}
