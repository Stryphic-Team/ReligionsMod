package com.stryphic.religionsmod.proxy;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.init.ModBlocks;
import com.stryphic.religionsmod.init.ModEntities;
import com.stryphic.religionsmod.init.ModItems;
import com.stryphic.religionsmod.init.ModSoundEvents;
import com.stryphic.religionsmod.utils.Reference;

import com.stryphic.stryphiccore.proxy.IProxy;
import com.stryphic.stryphiccore.util.handlers.CommonEventHandler;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy implements IProxy {
    public void registerItemRenderer(Item item, int meta, String id) {}

    @Override
    public void registerModel(Item item, int metadata) {

    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ConfigManager.load(Reference.MODID, Config.Type.INSTANCE);
        ReligionsMod.logger.info("Pre Intializing");
        //MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
        ModItems.init();
        ModBlocks.init();




        //CoreBlocks.initOreDictionary();
        //ModItems.initOreDictionary();


    }

    @Override
    public void init(FMLInitializationEvent event) {

        ReligionsMod.logger.info("Intializing");
        ConfigManager.sync(Reference.MODID, Config.Type.INSTANCE);

        //NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
        //PacketHandler.init();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        ModEntities.init();


    }
}
