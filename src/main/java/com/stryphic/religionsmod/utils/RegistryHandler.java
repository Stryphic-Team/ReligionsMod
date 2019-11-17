package com.stryphic.religionsmod.utils;

import com.stryphic.religionsmod.entityproperties.CapabilityProvider;
import com.stryphic.religionsmod.entityproperties.ReligionPropertiesCapability;
import com.stryphic.religionsmod.init.ModBlocks;
import com.stryphic.religionsmod.init.ModItems;
import com.stryphic.stryphiccore.blocks.ICoreBlock;
import com.stryphic.stryphiccore.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayerMP) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP) event.getObject();
            if (!entityPlayerMP.hasCapability(ReligionPropertiesCapability.RELIGION_CAPABILITY, null)) {
                event.addCapability(new ResourceLocation(Reference.MODID, "religion_data"), new CapabilityProvider());
            }
        }else if(event.getObject() instanceof EntityPlayer){
            if (!event.getObject().hasCapability(ReligionPropertiesCapability.RELIGION_CAPABILITY, null)) {
                event.addCapability(new ResourceLocation(Reference.MODID, "religion_data"), new CapabilityProvider());
            }
        }
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ModItems.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : ModBlocks.BLOCKS)
        {
            if(block instanceof ICoreBlock)
            {
                ((ICoreBlock)block).registerModels();
            }
        }
    }
}
