package creature;

import Enums.Armour;
import Enums.Weapons;

public class Player extends Creature {
    // for the sake of testing


    public Player(int attack, int defence, int constitution, int intelligence, int charisma, int speed, int health, int mana, Weapons weapon, Armour armour) {
        super(attack, defence, constitution, intelligence, charisma, speed, health, mana, weapon, armour);
    }
}
