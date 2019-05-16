package interfaces;

import Enums.Spells;
import creature.Creature;

public interface ISpell {
    int attackStrength(Spells spell);
    int calculateDamageDone(Spells spell, Creature creature);
    void declareAttack(Spells spell, Creature creature);
}
