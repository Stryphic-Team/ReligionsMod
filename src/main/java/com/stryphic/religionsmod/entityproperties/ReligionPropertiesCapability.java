package com.stryphic.religionsmod.entityproperties;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class ReligionPropertiesCapability {

    @CapabilityInject(ReligionProperties.class)
    public static Capability<ReligionProperties> RELIGION_CAPABILITY = null;

    public static ReligionProperties getPlayerProperties(EntityPlayer player){
        return player.getCapability(RELIGION_CAPABILITY,null);
    }
}
