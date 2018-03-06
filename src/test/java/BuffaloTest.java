import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuffaloTest {
    Buffalo buffalo;

    @Before
    public void setUp() throws Exception {
        buffalo = new Buffalo("Thunder Hoof", 500, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Thunder Hoof", buffalo.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(500, buffalo.getHealth());
    }
}
