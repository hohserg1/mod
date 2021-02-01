package imnotjahan.mod.danmachi.objects.blocks;

import imnotjahan.mod.danmachi.Main;
import imnotjahan.mod.danmachi.init.BlockInit;
import imnotjahan.mod.danmachi.init.ItemInit;
import imnotjahan.mod.danmachi.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RagingInferno extends BlockFire implements IHasModel
{
    public RagingInferno()
    {
        setUnlocalizedName("raging_inferno");
        setRegistryName("raging_inferno");

        setHardness(0);
        setLightLevel(1);
        disableStats();

        BlockInit.BLOCKS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.attackEntityFrom(DamageSource.IN_FIRE, 3.0F);
        entityIn.setFire(5);
    }

    @Override
    public void setFireInfo(Block blockIn, int encouragement, int flammability)
    {

    }
}
