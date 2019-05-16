import Enums.Armour;
import Enums.Weapons;
import creature.Character.Monk;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class MonkTest {

    Monk monk;

    @Before
    public void before(){
        monk = new Monk("Friar Tuck", 10,10,10,10,10,10,10, Weapons.DAGGER, Armour.LEATHER);
    }

//    @Test
//        public void canDodge() {
//        monk.reduceHealth(4);
//        assertEquals(6, monk.getHealth());
//    }
}
