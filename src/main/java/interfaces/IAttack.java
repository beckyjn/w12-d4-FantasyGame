package interfaces;

import creature.Creature;

public interface IAttack {
    int attackStrength();
    int calculateDamageDone(Creature creature);
    void declareAttack(Creature creature);
}
