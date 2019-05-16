package Enums;

public enum Armour {
    ROBE(2, "light"),
    LEATHER(4, "light"),
    BREASTPLATE(6, "heavy"),
    CHAIN_MAIL(8, "heavy");

    private final  int protection;
    private final String type;

    Armour(int protection, String type){
        this.protection = protection;
        this.type = type;
    }

    public int getProtection() {
        return protection;
    }

    public String getType() {
        return type;
    }
}
