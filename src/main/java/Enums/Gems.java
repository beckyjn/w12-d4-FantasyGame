package Enums;

public enum Gems {
    DIAMOND(100),
    SAPPHIRE(80),
    RUBY(40),
    AMETHYST(70),
    PEARL(20);

    private final int value;

    Gems(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
