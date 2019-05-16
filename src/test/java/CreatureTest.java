import Enums.Armour;
import Enums.Weapons;
import creature.Character.Barbarian;
import creature.Character.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CreatureTest {

    Barbarian enemy;
    Knight player;

    @Before
    public void before(){
        enemy = new Barbarian("Conan", 10,10,10,0,6,12,0, Weapons.SWORD, Armour.ROBE);
        player = new Knight("Sir Cumferance",10,10, 10,0,6,12,0, Weapons.SWORD, Armour.ROBE);
    }

    @Test
    public void checkAttackStrength() {
       assertNotEquals(10, player.attackStrength());
    }

    @Test
    public void checkDefenceStrength() {
        assertNotEquals(10, player.defenceStrength(enemy));
    }

    @Test
    public void heAttac() {
        player.declareAttack(enemy);
        assertNotEquals(70, enemy.getHealth());
    }
}
