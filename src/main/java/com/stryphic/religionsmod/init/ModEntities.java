package com.stryphic.religionsmod.init;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.religionsmod.entity.EntityJesus;
import com.stryphic.religionsmod.utils.Reference;
import com.stryphic.stryphiccore.util.prototypes.EntityPrototype;

import java.util.ArrayList;

public class ModEntities {
    public static ArrayList<EntityPrototype> ENTITIES = new ArrayList<EntityPrototype>();
    static{
        register(new EntityPrototype("jesus", Reference.MODID, EntityJesus.class));
    }

    public static void init(){
        for(EntityPrototype entity:ENTITIES){
            entity.register(ReligionsMod.instance);
        }
    }
    public static void register(EntityPrototype entity){
        ENTITIES.add(entity);
    }
}
