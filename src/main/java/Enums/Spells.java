package Enums;

public enum Spells {
    FIREBALL(20),
    LIGHTNING_STRIKE(15),
    THUNDER_WAVE(10),
    MAGIC_MISSILE(5),
    SHRINK(4),
    HASTE(4);

    private final int effect;

    Spells(int effect){
        this.effect = effect;
    }

    public int getEffect() {
        return effect;
    }
}
