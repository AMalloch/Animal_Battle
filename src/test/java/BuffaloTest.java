import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuffaloTest {
    Buffalo buffalo;
    PolarBear polarBear;

    @Before
    public void setUp() throws Exception {
        buffalo = new Buffalo("Thunder Hoof", 500, 20);
        polarBear = new PolarBear("White Walker", 300, 25);
    }

    @Test
    public void hasName() {
        assertEquals("Thunder Hoof", buffalo.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(500, buffalo.getHealth());
    }

    @Test
    public void canAttack(){
        buffalo.canAttack(polarBear);
        assertEquals(280, polarBear.getHealth());
    }
}
