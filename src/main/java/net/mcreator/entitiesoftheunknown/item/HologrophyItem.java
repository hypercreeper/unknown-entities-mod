
package net.mcreator.entitiesoftheunknown.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.entitiesoftheunknown.itemgroup.AncientItemsItemGroup;
import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

import java.util.List;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class HologrophyItem extends EntitiesOfTheUnknownModElements.ModElement {
	@ObjectHolder("entities_of_the_unknown:hologrophy")
	public static final Item block = null;
	public HologrophyItem(EntitiesOfTheUnknownModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, EntitiesOfTheUnknownModElements.sounds.get(new ResourceLocation("entities_of_the_unknown:holography")),
					new Item.Properties().group(AncientItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("hologrophy");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(":)"));
		}
	}
}
