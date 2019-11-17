package com.stryphic.religionsmod.entityhandlers;

import com.stryphic.religionsmod.ReligionsMod;
import com.stryphic.stryphiccore.entityhandlers.PlayerHandlerBase;
import com.stryphic.stryphiccore.util.RandomUtils;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;


public class PlayerTestHandler extends PlayerHandlerBase {
    @Override
    public void playerBreakBlock(EntityPlayer player, IBlockState state) {
        super.playerBreakBlock(player, state);
        player.getEntityWorld().setBlockState(
                new BlockPos(
                        RandomUtils.fromRangeI(-2,2) + player.posX,
                        player.posY,
                        RandomUtils.fromRangeI(-2,2) + player.posZ),
                    state
                );
    }
}
