package com.stryphic.religionsmod.init;

import com.stryphic.religionsmod.items.ItemBase;

import com.stryphic.religionsmod.items.ItemJesusMeatCooked;
import com.stryphic.religionsmod.items.ItemJesusMeatRaw;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import net.minecraft.item.Item;

public class ModItems {
    public static ArrayList<Item> ITEMS = new ArrayList<Item>();

    public static Item ITEM_JESUS_MEAT_RAW = new ItemJesusMeatRaw("jesus_meat_raw");
    public static Item ITEM_JESUS_MEAT_COOKED = new ItemJesusMeatCooked("jesus_meat_cooked");
    public static void init(){
        for(Item item:ITEMS){
            ForgeRegistries.ITEMS.register(item);
        }
    }
}
