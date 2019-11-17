package com.stryphic.religionsmod.proxy;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.init.ModSoundEvents;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));

    }
    @Override
    public void registerModel(Item item, int metadata)
    {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    public void registerEntityRenderer(){

    }
    //Run before Minecraft initializes
    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
        ReligionsMod.logger.debug("Client: Pre Intializing");
        ModSoundEvents.init();

    }
    //Run when the client connects to a server or starts a new single player world
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ReligionsMod.logger.debug("Client: Intializing");




    }
    //Run after Minecraft initializes
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);//You need one of these oops...
        ReligionsMod.logger.debug("Client: Pre Intializing");
        //MinecraftForge.EVENT_BUS.register(new KeyHandler());
        //MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
        
    }

}
