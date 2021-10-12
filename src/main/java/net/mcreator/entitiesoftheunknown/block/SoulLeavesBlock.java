
package net.mcreator.entitiesoftheunknown.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.entitiesoftheunknown.itemgroup.ShrineDimensionBlocksItemGroup;
import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

import java.util.List;
import java.util.Collections;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class SoulLeavesBlock extends EntitiesOfTheUnknownModElements.ModElement {
	@ObjectHolder("entities_of_the_unknown:soul_leaves")
	public static final Block block = null;
	public SoulLeavesBlock(EntitiesOfTheUnknownModElements instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(ShrineDimensionBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).notSolid());
			setRegistryName("soul_leaves");
		}

		@Override
		public float[] getBeaconColorMultiplier(BlockState state, IWorldReader world, BlockPos pos, BlockPos beaconPos) {
			return new float[]{0.6f, 0f, 0.6f};
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 1;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.PURPLE;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
