
package com.amjad.fpsboost;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ModConfig {

    public static final ForgeConfigSpec.BooleanValue PERFORMANCE_MODE;
    public static final ForgeConfigSpec.BooleanValue REDUCE_PARTICLES;
    public static final ForgeConfigSpec.BooleanValue REDUCE_ANIMATIONS;
    public static final ForgeConfigSpec.BooleanValue SHOW_FPS;

    public static final ForgeConfigSpec.IntValue PARTICLE_LIMIT;
    public static final ForgeConfigSpec.IntValue TARGET_FPS;

    public static final ForgeConfigSpec SPEC;

    static {
        ForgeConfigSpec.Builder builder =
                new ForgeConfigSpec.Builder();

        builder.push("performance");

        PERFORMANCE_MODE = builder
                .define("performanceMode", true);

        REDUCE_PARTICLES = builder
                .define("reduceParticles", false);

        REDUCE_ANIMATIONS = builder
                .define("reduceAnimations", false);

        SHOW_FPS = builder
                .define("showFPS", true);

        PARTICLE_LIMIT = builder
                .defineInRange("particleLimit", 100, 0, 10000);

        TARGET_FPS = builder
                .defineInRange("targetFPS", 120, 30, 360);

        builder.pop();

        SPEC = builder.build();
    }

    private ModConfig() {}
}
