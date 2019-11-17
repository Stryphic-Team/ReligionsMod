package com.stryphic.religionsmod.ai;


import com.stryphic.religionsmod.entityproperties.ReligionProperties;
import com.stryphic.religionsmod.entityproperties.ReligionPropertiesCapability;
import com.stryphic.religionsmod.init.Religion;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.Collections;
import java.util.List;

public class EntityAINearestNonChristian<T extends EntityLivingBase> extends EntityAINearestAttackableTarget {

    private final int targetChance = 10;
    Religion religion;
    public EntityAINearestNonChristian(EntityCreature creature, Class classTarget, boolean checkSight, Religion rel) {
        super(creature, classTarget, checkSight);
        this.religion = rel;
    }

    @Override
    public boolean shouldExecute()
    {
        if (this.targetChance > 0 && this.taskOwner.getRNG().nextInt(this.targetChance) != 0)
        {
            return false;
        }
        else if (this.targetClass != EntityPlayer.class && this.targetClass != EntityPlayerMP.class)
        {
            List<T> list = this.taskOwner.world.<T>getEntitiesWithinAABB(this.targetClass, this.getTargetableArea(this.getTargetDistance()), this.targetEntitySelector);

            if (list.isEmpty())
            {
                return false;
            }
            else
            {
                Collections.sort(list, this.sorter);
                this.targetEntity = list.get(0);
                return true;
            }
        }
        else
        {
            this.targetEntity = this.taskOwner.world.getNearestAttackablePlayer(this.taskOwner,this.getTargetDistance(),this.getTargetDistance());
            if (targetEntity != null){
                EntityPlayer player = (EntityPlayer)targetEntity;
                ReligionProperties religionProperties = player.getCapability(ReligionPropertiesCapability.RELIGION_CAPABILITY,null);
                if (religionProperties != null) {
                    int playerReligion = religionProperties.getReligion();

                    if (playerReligion == this.religion.ordinal()) {
                        return false;
                    }
                }
            }
            return this.targetEntity != null;
        }
    }
}
