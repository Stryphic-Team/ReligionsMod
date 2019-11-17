package com.stryphic.religionsmod.entityhandlers;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.stryphiccore.entityhandlers.PlayerHandlerBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerTestEventHandler extends PlayerHandlerBase {
    @Override
    public void playerBreakBlock(EntityPlayer player, IBlockState state) {
        super.playerBreakBlock(player, state);
        ReligionsMod.logger.info("TEST");
    }
}
