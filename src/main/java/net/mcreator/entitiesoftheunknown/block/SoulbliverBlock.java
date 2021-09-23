
package net.mcreator.entitiesoftheunknown.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.entitiesoftheunknown.itemgroup.ShrineDimensionBlocksItemGroup;
import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

import java.util.List;
import java.util.Collections;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class SoulbliverBlock extends EntitiesOfTheUnknownModElements.ModElement {
	@ObjectHolder("entities_of_the_unknown:soulbliver")
	public static final Block block = null;
	public SoulbliverBlock(EntitiesOfTheUnknownModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(ShrineDimensionBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1.1f, 34f).setLightLevel(s -> 2)
					.slipperiness(3.4f).speedFactor(2.1f).jumpFactor(3.7f));
			setRegistryName("soulbliver");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
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
