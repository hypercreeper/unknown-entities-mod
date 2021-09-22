
package net.mcreator.entitiesoftheunknown.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.entitiesoftheunknown.item.LeafswordItem;
import net.mcreator.entitiesoftheunknown.item.LeafbowItem;
import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownModElements;

@EntitiesOfTheUnknownModElements.ModElement.Tag
public class LeafPowerEnchantment extends EntitiesOfTheUnknownModElements.ModElement {
	@ObjectHolder("entities_of_the_unknown:leaf_power")
	public static final Enchantment enchantment = null;
	public LeafPowerEnchantment(EntitiesOfTheUnknownModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("leaf_power"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 5;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == LeafswordItem.block)
				return true;
			if (stack.getItem() == LeafbowItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
