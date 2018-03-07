import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TigerTest {
    Tiger tiger;
    Buffalo buffalo;

    @Before
    public void setUp() throws Exception {
        tiger = new Tiger("Khan", 200, 40);
        buffalo = new Buffalo("Thunder Hoof", 500, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Khan", tiger.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(250, tiger.getHealth());
    }

    @Test
    public void canAttack(){
        tiger.canAttack(buffalo);
        assertEquals(460, buffalo.getHealth());
    }

    @Test
    public void canRoar(){
        assertEquals("Hear me roar!", tiger.roar("roar!"));
    }
}
