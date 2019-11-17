package com.stryphic.religionsmod.init;

import net.minecraft.util.text.TextFormatting;

public enum Religion {

    NON_RELIGIOUS("Non-Religious", TextFormatting.GRAY),
    CHRISTIAN("Christian", TextFormatting.LIGHT_PURPLE),
    JEWISH("Jewish", TextFormatting.BLUE),
    MUSLIM("Muslim", TextFormatting.DARK_GREEN),
    HINDU("Hindu", TextFormatting.GOLD),
    BUDDHIST("Buddhist", TextFormatting.YELLOW),
    JOWALI("Jowali", TextFormatting.RED);

    private String displayName;
    private TextFormatting textFormatting;
    private Religion(String displayName, TextFormatting txt){

        this.displayName = displayName;
        this.textFormatting = txt;
    }

    public String getDisplayName(){
        return this.displayName;
    }

    public TextFormatting getTextFormatting(){ return this.textFormatting; }

}
