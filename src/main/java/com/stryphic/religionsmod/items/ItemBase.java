package com.stryphic.religionsmod.items;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.init.ModItems;
import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.items.ItemCore;

public class ItemBase extends ItemCore {
    public ItemBase(String name) {
        super(name,Reference.MODID,Reference.RELIGIONS_MOD_TAB);
    }

    @Override
    public void registerModels() {
        ReligionsMod.proxy.registerModel(this,0);
    }

    @Override
    public void addToRegistry() {
        ModItems.ITEMS.add(this);
    }
}
