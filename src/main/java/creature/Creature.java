package creature;

import Enums.Armour;
import Enums.Weapons;
import interfaces.ILoot;

import java.util.ArrayList;

public  abstract class Creature {
    protected int attack;
    protected int defence;
    protected int constitution;
    protected int intelligence;
    protected int charisma;
    protected int speed;
    protected int health;
    protected int mana;
    protected Weapons weapon;
    protected Armour armour;
    protected ArrayList<ILoot> loot;

    public Creature(int attack, int defence, int constitution, int intelligence, int charisma, int speed, int health, int mana, Weapons weapon, Armour armour) {
        this.attack = attack;
        this.defence = defence;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.speed = speed;
        this.health = health;
        this.mana = mana;
        this.weapon = weapon;
        this.armour = armour;
        this.loot = new ArrayList<>();
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getConstitution() {
        return constitution;
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

    public ArrayList<ILoot> getLoot() {
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

    public void setLoot(ArrayList<ILoot> loot) {
        this.loot = loot;
    }

    public int attackStrength(Creature attacker){
        int weaponDamage = attacker.getWeapon().getDamage();
        int calculateDamage = (int)(Math.random() * weaponDamage + 1);
        return calculateDamage + attacker.getAttack();
    }

    public int defenceStrength(){
        int targetsDefence = armour.getProtection();
        int calculateDefence = (int)(Math.random() * targetsDefence + 1);
        return calculateDefence + defence;
    }

    public void healthReduction(Creature attacker){
        int damageDone = attackStrength(attacker) - defenceStrength();
        if (damageDone > 0 ){
            health -= damageDone;
        }
    }
}

