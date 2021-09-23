
package net.mcreator.entitiesoftheunknown.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

import java.util.List;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class BowlofcandyItem extends EntitiesOfTheUnknownModElements.ModElement {
	@ObjectHolder("entities_of_the_unknown:bowlofcandy")
	public static final Item block = null;
	public BowlofcandyItem(EntitiesOfTheUnknownModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(55).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(12).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("bowlofcandy");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 18;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("so creamy and full of candies. too good to even share"));
		}
	}
}
