
package net.mcreator.entitiesoftheunknown.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.entitiesoftheunknown.itemgroup.AncientItemsItemGroup;
import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class ThesoundofambienceItem extends EntitiesOfTheUnknownModElements.ModElement {
	@ObjectHolder("entities_of_the_unknown:thesoundofambience")
	public static final Item block = null;
	public ThesoundofambienceItem(EntitiesOfTheUnknownModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, EntitiesOfTheUnknownModElements.sounds.get(new ResourceLocation("entities_of_the_unknown:the_sweet_sound_of_ambience")),
					new Item.Properties().group(AncientItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("thesoundofambience");
		}
	}
}
