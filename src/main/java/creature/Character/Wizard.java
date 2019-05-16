package creature.Character;

import Enums.Armour;
import Enums.Spells;
import Enums.Weapons;
import creature.Creature;
import interfaces.IProtecc;
import interfaces.ISpell;

public class Wizard extends Creature implements ISpell, IProtecc {
    public Wizard(String name, int attack, int defence, int intelligence, int charisma, int speed, int health, int mana, Weapons weapon, Armour armour) {
        super(name, attack, defence, intelligence, charisma, speed, health, mana, weapon, armour);
    }

    public int attackStrength(Spells spell) {
        int spellDamage = spell.getEffect();
        int calculateDamage = (int) (Math.random() * spellDamage + 1);
        return calculateDamage + getIntelligence();
    }


    public int defenceStrength(Creature target) {
        int targetsDefence = target.getArmour().getProtection();
        int calculateDefence = (int) (Math.random() * targetsDefence + 1);
        return calculateDefence + target.getDefence();
    }

    public int calculateDamageDone(Spells spell, Creature target) {
        int damageDone;
        if (spell.getType().equals("Damage")) {
            damageDone = attackStrength(spell) - defenceStrength(target);
            if (damageDone > 0) {
                return damageDone;
            } else {
                damageDone = 0;
            }
        } else if (spell.getType().equals("ConditionAttack")) {
            int newStat = target.getAttack() - spell.getEffect();
            target.setAttack(newStat);
            damageDone = 0;
        } else if (spell.getType().equals("ConditionSpeed")) {
            int newStat = target.getSpeed() - spell.getEffect();
            target.setSpeed(newStat);
            damageDone = 0;
        } else {
            damageDone = 0;
        }
    return damageDone;

}


    public void declareAttack(Spells spell, Creature target){
        int damageDone = calculateDamageDone(spell, target);
        target.reduceHealth(damageDone);
        mana -= spell.getManaCost();
    }
}
