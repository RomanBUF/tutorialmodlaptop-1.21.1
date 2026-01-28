package net.zero.tutorialmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.zero.tutorialmod.item.ModItems;

import static net.minecraft.state.property.Properties.POWERED;

public class KeyCardReaderBlock extends Block {

    private final Item KeyCard_lvl;

    public KeyCardReaderBlock(Settings settings, Item KeyCard_lvl) {
        super(settings);
        this.KeyCard_lvl = KeyCard_lvl;

        this.setDefaultState(this.getDefaultState().with(POWERED, false));
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (player.getMainHandStack().isOf(this.KeyCard_lvl)) {
            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hit);
    }
}
