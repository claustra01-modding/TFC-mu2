package net.claustra01.tfcm;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum TfcmVanillaStone {
    NETHERRACK("netherrack", Blocks.NETHERRACK, 3.0F, 10.0F),
    ENDSTONE("endstone", Blocks.END_STONE, 3.0F, 10.0F);

    private final String serializedName;
    private final Block baseBlock;
    private final float hardness;
    private final float explosionResistance;

    TfcmVanillaStone(String serializedName, Block baseBlock, float hardness, float explosionResistance) {
        this.serializedName = serializedName;
        this.baseBlock = baseBlock;
        this.hardness = hardness;
        this.explosionResistance = explosionResistance;
    }

    public String getSerializedName() {
        return serializedName;
    }

    public Block baseBlock() {
        return baseBlock;
    }

    public float hardness() {
        return hardness;
    }

    public float explosionResistance() {
        return explosionResistance;
    }
}
