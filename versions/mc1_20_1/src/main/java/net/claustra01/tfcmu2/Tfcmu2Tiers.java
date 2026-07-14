package net.claustra01.tfcmu2;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class Tfcmu2Tiers {
    public static final Tier INVAR = create(3, 2200, 8f, 4.75f, 12, "invar");
    public static final Tier TITANIUM = create(5, 3300, 11f, 7f, 17, "titanium");
    public static final Tier TUNGSTEN_STEEL = create(7, 8125, 13f, 10.5f, 25, "tungsten_steel");

    private Tfcmu2Tiers() {
    }

    private static Tier create(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, String repairMetal) {
        return new Tier() {
            @Override
            public int getUses() {
                return uses;
            }

            @Override
            public float getSpeed() {
                return speed;
            }

            @Override
            public float getAttackDamageBonus() {
                return attackDamageBonus;
            }

            @Override
            public int getLevel() {
                return level;
            }

            @Override
            public int getEnchantmentValue() {
                return enchantmentValue;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Tfcmu2ArmorMaterials.repairIngredient(repairMetal);
            }
        };
    }
}
