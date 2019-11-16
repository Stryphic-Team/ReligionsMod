package com.stryphic.religionsmod.utils;

import com.stryphic.stryphiccore.init.CoreBlocks;
import net.minecraft.item.ItemStack;

public class Reference {
    public static final String MODID = "religionsmod";
    public static final String NAME = "Religions Mod";
    public static final String VERSION = "0.0.1";

    public static final String CLIENT_PROXY_CLASS = "com.stryphic.religionsmod.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.stryphic.religionsmod.proxy.CommonProxy";

    public static final String PREFIX = MODID + ".";
    public static final String RESOURCE_PREFIX = MODID + ":";
    public static final net.minecraft.creativetab.CreativeTabs RELIGIONS_MOD_TAB = new net.minecraft.creativetab.CreativeTabs(MODID.toLowerCase()) {
        @Override
        public ItemStack getTabIconItem() {
            ItemStack itemStack = new ItemStack(CoreBlocks.BLOCK_GREEN);
            return itemStack;

        }
    };
}
