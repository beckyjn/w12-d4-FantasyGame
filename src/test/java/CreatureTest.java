import Enums.Armour;
import Enums.Weapons;
import creature.Enemy;
import creature.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CreatureTest {

    Enemy enemy;
    Player player;

    @Before
    public void before(){
        enemy = new Enemy(10,10,10,0,0,6,12,0, Weapons.SWORD, Armour.ROBE);
        player = new Player(10,10, 10, 0,0,6,12,0, Weapons.SWORD, Armour.ROBE);
    }

    @Test
    public void checkAttackStrength() {
       assertNotEquals(10, player.attackStrength(enemy));
    }

    @Test
    public void checkDefenceStrength() {
        assertNotEquals(10, player.defenceStrength());
    }

//    @Test
//    public void canBeAttacked() {
//        player.healthReduction(enemy);
//        assertNotEquals(0, player.getHealth());
//    }
}
