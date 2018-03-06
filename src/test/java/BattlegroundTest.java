import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattlegroundTest {
    PolarBear polarBear;
    Buffalo buffalo;
    Tiger tiger;

    @Before
    public void setUp() throws Exception {
        this.polarBear = new PolarBear("White Walker", 300, 25);
        tiger = new Tiger("Khan", 200, 40);
        buffalo = new Buffalo("Thunder Hoof", 500, 20);
    }

    @Test
    public void canPolarBearAttack() {

        assertEquals(475, buffalo.getHealth());
    }
}
