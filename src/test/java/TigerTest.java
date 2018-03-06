import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TigerTest {
    Tiger tiger;

    @Before
    public void setUp() throws Exception {
        tiger = new Tiger("Khan", 200, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Khan", tiger.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(250, tiger.getHealth());
    }
}
