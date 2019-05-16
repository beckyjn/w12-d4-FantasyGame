package creature;

import Enums.Armour;
import Enums.Weapons;
import interfaces.IAttack;
import interfaces.IDefend;

public class Barbarian extends Creature implements IAttack, IDefend {

    public Barbarian(String name, int attack, int defence, int intelligence, int charisma, int speed, int health, int mana, Weapons weapon, Armour armour) {
        super(name, attack, defence, intelligence, charisma, speed, health, mana, weapon, armour);
        this.attack = attack*2;
    }

    public int attackStrength(){
        int weaponDamage = weapon.getDamage();
        int calculateDamage = (int)(Math.random() * weaponDamage + 1);
        return calculateDamage + getAttack();
    }


    public int defenceStrength(Creature target){
        int targetsDefence = target.getArmour().getProtection();
        int calculateDefence = (int)(Math.random() * targetsDefence + 1);
        return calculateDefence + target.getDefence();
    }

    public int calculateDamageDone(Creature target){
        int damageDone = attackStrength() - defenceStrength(target);
        if (damageDone > 0 ){
            return damageDone;
        } else {
            return 0;
        }
    }

    public void declareAttack(Creature target){
        int damageDone = calculateDamageDone(target);
        target.reduceHealth(damageDone);
    }


}
