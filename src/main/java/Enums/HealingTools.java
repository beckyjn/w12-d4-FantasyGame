package Enums;

public enum HealingTools {
    LESSER_POTION(6),
    POTION(12),
    GREATER_POTION(20),
    ELIXIR(12);

    private final int effect;

    HealingTools(int effect){
        this.effect = effect;
    }

    public int getEffect() {
        return effect;
    }

}
