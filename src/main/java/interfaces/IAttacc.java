package interfaces;

import creature.Creature;

public interface IAttacc {
    int attackStrength();
    int calculateDamageDone(Creature creature);
    void declareAttack(Creature creature);
}
