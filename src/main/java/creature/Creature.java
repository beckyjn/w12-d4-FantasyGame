package creature;

import Enums.Armour;
import Enums.Weapons;
import interfaces.ILoot;

import java.util.ArrayList;
import java.util.HashMap;

public  abstract class Creature {
    protected String name;
    protected int attack;
    protected int defence;
    protected int intelligence;
    protected int charisma;
    protected int speed;
    protected int health;
    protected int mana;
    protected Weapons weapon;
    protected Armour armour;
    protected HashMap<ILoot, Integer> loot;

    public Creature(String name, int attack, int defence, int intelligence, int charisma, int speed, int health, int mana, Weapons weapon, Armour armour) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.speed = speed;
        this.health = health;
        this.mana = mana;
        this.weapon = weapon;
        this.armour = armour;
        this.loot = new HashMap<>();
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public HashMap<ILoot, Integer> getLoot() {
        return loot;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public void setLoot(HashMap<ILoot, Integer> loot) {
        this.loot = loot;
    }

    public void reduceHealth(int damageDone){
        health -= damageDone;
    }
}

