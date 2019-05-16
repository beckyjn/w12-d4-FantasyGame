package Enums;

public enum Weapons {
    AXE(12),
    SWORD(8),
    DAGGER(4),
    WAND(3);

    private final int damage;

    Weapons(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }


}
