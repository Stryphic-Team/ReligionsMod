package com.stryphic.religionsmod.init;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.items.ItemBase;
import com.stryphic.religionsmod.items.ItemJesusMeat;
import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.StryphicCore;
import com.stryphic.stryphiccore.blocks.BlockCore;
import com.stryphic.stryphiccore.init.CoreItems;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import net.minecraft.item.Item;

public class ModItems {
    public static ArrayList<Item> ITEMS = new ArrayList<Item>();

    public static ItemBase ITEM_JESUS_MEAT = new ItemJesusMeat("jesus_meat");
    public static void init(){
        for(Item item:ITEMS){
            ForgeRegistries.ITEMS.register(item);
        }
    }
}
