package com.amjad.fpsboost;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AMJADFPSBoost.MOD_ID)
public class AMJADFPSBoost {

    public static final String MOD_ID = "amjad_fps_boost";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public AMJADFPSBoost() {
        LOGGER.info("AMJAD FPS BOOST PRO loaded!");
    }
}
