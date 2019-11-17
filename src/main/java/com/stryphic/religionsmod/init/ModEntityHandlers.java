package com.stryphic.religionsmod.init;

import com.stryphic.religionsmod.entityhandlers.PlayerTestHandler;
import com.stryphic.stryphiccore.entityhandlers.PlayerHandlerBase;

public class ModEntityHandlers {
    public static void init() {
        new PlayerTestHandler();
    }
}
