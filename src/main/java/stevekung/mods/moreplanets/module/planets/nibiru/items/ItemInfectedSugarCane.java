package stevekung.mods.moreplanets.module.planets.nibiru.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import stevekung.mods.moreplanets.module.planets.nibiru.blocks.NibiruBlocks;
import stevekung.mods.moreplanets.util.blocks.BlockBushMP;
import stevekung.mods.moreplanets.util.helper.BlockStateHelper;
import stevekung.mods.moreplanets.util.items.EnumSortCategoryItem;
import stevekung.mods.moreplanets.util.items.ItemBaseMP;

public class ItemInfectedSugarCane extends ItemBaseMP
{
    public ItemInfectedSugarCane(String name)
    {
        super();
        this.setUnlocalizedName(name);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemStack = player.getHeldItem(hand);
        IBlockState iblockstate = world.getBlockState(pos);
        Block block = iblockstate.getBlock();
        BlockBushMP cane = NibiruBlocks.INFECTED_SUGAR_CANE_BLOCK;

        if (block == Blocks.SNOW_LAYER && iblockstate.getValue(BlockSnow.LAYERS).intValue() < 1 || block == NibiruBlocks.INFECTED_SNOW_LAYER && iblockstate.getValue(BlockStateHelper.LAYERS).intValue() < 1)
        {
            facing = EnumFacing.UP;
        }
        else if (!block.isReplaceable(world, pos))
        {
            pos = pos.offset(facing);
        }

        if (player.canPlayerEdit(pos, facing, itemStack) && itemStack.getCount() != 0 && world.mayPlace(cane, pos, false, facing, (Entity)null))
        {
            IBlockState iblockstate1 = cane.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, 0, player, hand);

            if (!world.setBlockState(pos, iblockstate1, 11))
            {
                return EnumActionResult.FAIL;
            }
            else
            {
                iblockstate1 = world.getBlockState(pos);

                if (iblockstate1.getBlock() == cane)
                {
                    ItemBlock.setTileEntityNBT(world, player, pos, itemStack);
                    iblockstate1.getBlock().onBlockPlacedBy(world, pos, iblockstate1, player, itemStack);
                }
                SoundType soundtype = iblockstate1.getBlock().getSoundType(iblockstate1, world, pos, player);
                world.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                itemStack.shrink(1);
                return EnumActionResult.SUCCESS;
            }
        }
        else
        {
            return EnumActionResult.FAIL;
        }
    }

    @Override
    public EnumSortCategoryItem getItemCategory(int meta)
    {
        return EnumSortCategoryItem.PLACEABLE_PLANT;
    }

    @Override
    public String getName()
    {
        return "infected_sugar_cane";
    }
}