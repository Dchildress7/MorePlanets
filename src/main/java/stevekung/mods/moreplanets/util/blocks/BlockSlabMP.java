package stevekung.mods.moreplanets.util.blocks;

import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import stevekung.mods.moreplanets.core.MorePlanetsCore;

public abstract class BlockSlabMP extends BlockSlab implements ISortableBlock, ISlabBlock
{
    public BlockSlabMP(Material material)
    {
        super(material);
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }

    @Override
    public int quantityDropped(Random rand)
    {
        return this.isDouble() ? 2 : 1;
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return this.getMetaFromState(state) & 7;
    }

    @Override
    public CreativeTabs getCreativeTabToDisplayOn()
    {
        return !this.isDouble() ? MorePlanetsCore.BLOCK_TAB : null;
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(this, 1, this.getMetaFromState(state) & 7);
    }

    @Override
    public String getUnlocalizedName(int meta)
    {
        return super.getUnlocalizedName();
    }
}