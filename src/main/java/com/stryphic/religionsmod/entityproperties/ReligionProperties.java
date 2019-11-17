package com.stryphic.religionsmod.entityproperties;

import net.minecraft.nbt.NBTTagCompound;

public class ReligionProperties {

    private int religion = 0;

    public ReligionProperties(){

    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }



    public void copyFrom(ReligionProperties oldReligionProperties){

        this.religion = oldReligionProperties.getReligion();

    }

    public void saveNBTData(NBTTagCompound compound){
        compound.setInteger("religion",religion);
    }
    public void loadNBTData(NBTTagCompound compound){
        this.religion = compound.getInteger("religion");
    }

}
