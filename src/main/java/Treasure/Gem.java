package Treasure;

import Enums.Gems;

public class Gem {
    private Gems gem;

    public Gem(Gems gem) {
        this.gem = gem;
    }

    public int getValue() {
        return gem.getValue();
    }
}
