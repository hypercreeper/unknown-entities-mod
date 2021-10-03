package net.mcreator.entitiesoftheunknown.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.entitiesoftheunknown.EntitiesOfTheUnknownMod;

import java.util.Map;

public class BagofchipsFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EntitiesOfTheUnknownMod.LOGGER.warn("Failed to load dependency entity for procedure BagofchipsFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 600, (int) 1, (false), (true)));
	}
}
