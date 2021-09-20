
package net.mcreator.entitiesoftheunknown.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.entitiesoftheunknown.block.ShrineBlockBlock;
import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class ShrineDimensionBlocksItemGroup extends EntitiesOfTheUnknownModElements.ModElement {
	public ShrineDimensionBlocksItemGroup(EntitiesOfTheUnknownModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabshrine_dimension_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ShrineBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
