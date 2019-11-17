package com.stryphic.religionsmod;

import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ReligionsMod
{
    @Mod.Instance
    public static ReligionsMod instance;

    public static Logger logger;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        //logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
