package com.stryphic.religionsmod.init;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.StryphicCore;
import com.stryphic.stryphiccore.blocks.BlockCore;
import com.stryphic.stryphiccore.init.CoreItems;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;

public class ModBlocks {
    public static ArrayList<Block> BLOCKS = new ArrayList<Block>();



    public static void init(){
        for(Block block:BLOCKS){
            ForgeRegistries.BLOCKS.register(block);
        }
    }



    public static void register(BlockCore blockCore){

    }
}
