package com.amjad.fpsboost;

public final class PerformanceConfig {

    public static boolean ENABLE_PERFORMANCE_MODE = true;
    public static boolean REDUCE_PARTICLES = true;
    public static boolean REDUCE_ANIMATIONS = true;
    public static boolean SHOW_FPS = true;

    public static int PARTICLE_LIMIT = 100;
    public static int TARGET_FPS = 120;

    private PerformanceConfig() {
    }

    public static void reset() {
        ENABLE_PERFORMANCE_MODE = true;
        REDUCE_PARTICLES = true;
        REDUCE_ANIMATIONS = true;
        SHOW_FPS = true;
        PARTICLE_LIMIT = 100;
        TARGET_FPS = 120;
    }
}
