import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolarBearTest {
    PolarBear polarbear;

    @Before
    public void setUp() throws Exception {
        polarbear = new PolarBear("White Walker", 300, AttackDamage.POLARBEAR);

    }

    @Test
    public void hasName() {
        assertEquals("White Walker", polarbear.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(300, polarbear.getHealth());
    }

    @Test
    public void canAttack(){

    }

}
