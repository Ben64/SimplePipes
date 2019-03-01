package alexiil.mc.mod.pipes.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import alexiil.mc.lib.attributes.item.ItemInvUtil;
import alexiil.mc.lib.attributes.item.impl.EmptyItemInvStats;

public class BlockTriggerInvEmpty extends BlockTrigger {

    public BlockTriggerInvEmpty(Block.Settings settings) {
        super(settings);
    }

    @Override
    protected boolean isTriggerBlock(World world, BlockPos pos, Direction dir) {
        pos = pos.offset(dir);
        return ItemInvUtil.getItemInvStats(world, pos) != EmptyItemInvStats.INSTANCE;
    }

    @Override
    public TileTrigger createBlockEntity(BlockView view) {
        return new TileTriggerInvEmpty();
    }
}