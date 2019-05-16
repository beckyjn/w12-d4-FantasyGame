import Enums.Armour;
import Enums.Spells;
import Enums.Weapons;
import creature.Character.Knight;
import creature.Character.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WizardTest {

    Wizard wizard;
    Knight knight;
     @Before
    public void before(){
         wizard = new Wizard("Merlin", 0, 0, 20,0, 0, 10, 10, Weapons.WAND, Armour.ROBE);
         knight = new Knight("Arthur", 10, 5, 5, 0, 10, 20, 10, Weapons.SWORD, Armour.BREASTPLATE);
     }

    @Test
    public void wizardCanCastSpell() {
         wizard.declareAttack(Spells.MAGIC_MISSILE, knight);
         assertEquals(9, wizard.getMana());
         assertNotEquals(20, knight.getHealth());
    }

    @Test
    public void canCastConditionSpell() {
         wizard.declareAttack(Spells.SLOW, knight);
         assertEquals(6, knight.getSpeed());
    }

    @Test
    public void canShrink() {
         wizard.declareAttack(Spells.SHRINK, knight);
         assertEquals(6, knight.getAttack());
    }
}
