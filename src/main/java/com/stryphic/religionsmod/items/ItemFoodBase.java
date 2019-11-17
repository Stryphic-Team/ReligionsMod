package com.stryphic.religionsmod.items;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.init.ModItems;
import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.items.ItemFoodCore;
import net.minecraft.creativetab.CreativeTabs;

public class ItemFoodBase extends ItemFoodCore {
    public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood) {
        super(name, Reference.MODID,Reference.RELIGIONS_MOD_TAB, amount, saturation, isWolfFood);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        ReligionsMod.proxy.registerModel(this,0);
    }
}
