import Enums.Gems;
import Treasure.Coin;
import Treasure.Gem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Gem diamond;
    Gem pearl;
    Coin goldCoin;

    @Before
    public void before() {
        diamond = new Gem(Gems.DIAMOND);
        pearl = new Gem(Gems.PEARL);
        goldCoin = new Coin("gold", 10);
    }

    @Test
    public void diamondHasValue() {
        assertEquals(100, diamond.getValue());
    }

    @Test
    public void pearlHasValue() {
        assertEquals(20, pearl.getValue());
    }

    @Test
    public void coinHasType() {
        assertEquals("gold", goldCoin.getType());
    }

    @Test
    public void coinHasValue() {
        assertEquals(10, goldCoin.getValue());
    }
}
