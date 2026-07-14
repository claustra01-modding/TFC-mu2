package net.claustra01.tfcmu2;

import net.dries007.tfc.common.LevelTier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public final class Tfcmu2Tiers {
    public static final LevelTier INVAR = create(BlockTags.INCORRECT_FOR_IRON_TOOL, 3, 2200, 8f, 4.75f, 12, "invar");
    public static final LevelTier TITANIUM = create(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5, 3300, 11f, 7f, 17, "titanium");
    public static final LevelTier TUNGSTEN_STEEL = create(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 7, 8125, 13f, 10.5f, 25, "tungsten_steel");

    private Tfcmu2Tiers() {
    }

    private static LevelTier create(TagKey<Block> incorrectBlocks, int level, int uses, float speed, float attackDamageBonus,
                                    int enchantmentValue, String repairMetal) {
        return new LevelTier() {
            @Override
            public int level() {
                return level;
            }

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
            public TagKey<Block> getIncorrectBlocksForDrops() {
                return incorrectBlocks;
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
