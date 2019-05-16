package Enums;

public enum Spells {
    FIREBALL(20, "Damage", 5),
    LIGHTNING_STRIKE(15, "Damage", 3),
    THUNDER_WAVE(10, "Damage",2),
    MAGIC_MISSILE(5, "Damage",1),
    SHRINK(4, "ConditionAttack",3),
    SLOW(4, "ConditionSpeed",3);

    private final int effect;
    private final int manaCost;
    private final String type;

    Spells(int effect, String type, int manaCost){
        this.effect = effect;
        this.type = type;
        this.manaCost = manaCost;
    }

    public int getEffect() {
        return effect;
    }

    public String getType() {
        return type;
    }

    public int getManaCost() {
        return manaCost;
    }
}
