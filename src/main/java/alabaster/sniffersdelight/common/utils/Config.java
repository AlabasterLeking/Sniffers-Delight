package alabaster.sniffersdelight.common;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {

    public static ForgeConfigSpec COMMON_CONFIG;

    public static final String CATEGORY_SETTINGS = "settings";

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COMMON_BUILDER.comment("Game settings").push(CATEGORY_SETTINGS);

        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}