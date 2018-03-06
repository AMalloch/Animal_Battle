import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattlegroundTest {
    PolarBear polarBear;
    Buffalo buffalo;
    Tiger tiger;

    @Before
    public void setUp() throws Exception {
        this.polarBear = new PolarBear("White Walker", 300, AttackDamage.POLARBEAR);
        tiger = new Tiger("Khan", 200, AttackDamage.TIGER);
        buffalo = new Buffalo("Thunder Hoof", 500, AttackDamage.BUFFALO);
    }

    @Test
    public void canPolarBearAttack() {

        assertEquals(475, buffalo.getHealth());
    }
}
