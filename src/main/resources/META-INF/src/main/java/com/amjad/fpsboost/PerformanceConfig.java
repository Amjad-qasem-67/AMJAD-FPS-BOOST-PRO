
package com.amjad.fpsboost;

public final class PerformanceConfig {

    private PerformanceConfig() {}

    public static boolean ENABLE_PERFORMANCE_MODE = true;
    public static boolean REDUCE_PARTICLES = false;
    public static boolean REDUCE_ANIMATIONS = false;
    public static boolean SHOW_FPS = true;

    public static int PARTICLE_LIMIT = 100;
    public static int TARGET_FPS = 120;

    public static void reset() {
        ENABLE_PERFORMANCE_MODE = true;
        REDUCE_PARTICLES = false;
        REDUCE_ANIMATIONS = false;
        SHOW_FPS = true;
        PARTICLE_LIMIT = 100;
        TARGET_FPS = 120;
    }
}
