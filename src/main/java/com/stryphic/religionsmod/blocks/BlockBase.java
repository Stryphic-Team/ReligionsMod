package com.stryphic.religionsmod.blocks;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.init.ModBlocks;
import com.stryphic.religionsmod.init.ModItems;
import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.blocks.BlockCore;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;


public class BlockBase extends BlockCore {

    public BlockBase(String name) {
        super(name, Reference.MODID, Material.ROCK,Reference.RELIGIONS_MOD_TAB);
    }

    @Override
    public void addItemToRegistry() {
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }

    @Override
    public void addBlockToRegistry() {
        ModBlocks.BLOCKS.add(this);
    }

    @Override
    public void registerModels() {
        ReligionsMod.proxy.registerModel(new ItemBlock(this).setRegistryName(name),0);
    }
}
