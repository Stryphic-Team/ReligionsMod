package com.stryphic.religionsmod.init;

import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.util.prototypes.SoundEventPrototype;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


import java.util.ArrayList;


public class ModSoundEvents {
    public static ArrayList<SoundEventPrototype> SOUND_EVENTS = new ArrayList<SoundEventPrototype>();
    public static SoundEvent[] SOUND_EVENT_JESUS_AMBIENT = new SoundEvent[]{
            register("jesus_ambient_0"),
            register("jesus_ambient_1"),
            register("jesus_ambient_2"),
            register("jesus_ambient_3"),
            register("jesus_ambient_4"),
    };

    public static SoundEvent[] SOUND_EVENT_ANGEL_AMBIENT = new SoundEvent[]{
            register("angel_0"),
            register("angel_1"),
            register("angel_2"),
            register("angel_3")
    };
    public static SoundEvent[] SOUND_EVENT_ANGEL_HURT = new SoundEvent[]{
            register("angel_hurt_0"),
            register("angel_hurt_1"),
            register("angel_hurt_2")
    };


    public static SoundEvent register(String name){
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent soundEvent = new SoundEvent(location);
        SOUND_EVENTS.add(new SoundEventPrototype(location,soundEvent));
        return soundEvent;
    }
    public static void init(){
        for(SoundEventPrototype soundEventPrototype:SOUND_EVENTS){
            if(soundEventPrototype != null){
                soundEventPrototype.getSoundEvent().setRegistryName(soundEventPrototype.getResourceLocation());
                ForgeRegistries.SOUND_EVENTS.register(soundEventPrototype.getSoundEvent());
            }

        }


    }
}
