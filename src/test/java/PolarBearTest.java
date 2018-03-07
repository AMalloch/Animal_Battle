import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolarBearTest {
    Buffalo buffalo;
    PolarBear polarbear;

    @Before
    public void setUp() throws Exception {
        polarbear = new PolarBear("White Walker", 300, 25);
        buffalo = new Buffalo("Thunder Hoof", 500, 20);

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
        polarbear.canAttack(buffalo);
        assertEquals(475, buffalo.getHealth());
    }

    @Test
    public void canRegenerate(){
        polarbear.regenerate(polarbear, 10);
        assertEquals(310, polarbear.getHealth());
    }

    @Test
    public void canRoar(){
        assertEquals("Hear me roar!", polarbear.roar("roar!"));
    }

}
