
package net.mcreator.entitiesoftheunknown.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.entitiesoftheunknown.itemgroup.AncientItemsItemGroup;
import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

import java.util.List;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class ShinedgemItem extends EntitiesOfTheUnknownModElements.ModElement {
	@ObjectHolder("entities_of_the_unknown:shinedgem")
	public static final Item block = null;
	public ShinedgemItem(EntitiesOfTheUnknownModElements instance) {
<<<<<<< Updated upstream
		super(instance, 13);
=======
		super(instance, 10);
>>>>>>> Stashed changes
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
<<<<<<< Updated upstream
			super(new Item.Properties().group(AncientItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
=======
			super(new Item.Properties().group(AncientItemsItemGroup.tab).maxStackSize(20).isImmuneToFire().rarity(Rarity.RARE));
>>>>>>> Stashed changes
			setRegistryName("shinedgem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
<<<<<<< Updated upstream
			return 1F;
=======
			return 0F;
>>>>>>> Stashed changes
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
<<<<<<< Updated upstream
			list.add(new StringTextComponent("very rare"));
			list.add(new StringTextComponent("rery shiny. better keep it in your inventory than hanging around near thieves in your pockets"));
=======
			list.add(new StringTextComponent("very rare and very shiney. loved by the ones who shine."));
>>>>>>> Stashed changes
		}
	}
}
