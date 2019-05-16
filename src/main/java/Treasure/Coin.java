package Treasure;

public class Coin {
    private String type;
    private int value;

    public Coin(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
