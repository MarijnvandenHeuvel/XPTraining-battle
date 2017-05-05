package be.cegeka.battle.weapons;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TwoHandedSwordTest {

    @Test
    public void amountOfDamage_shouldReturn5() {
        assertThat(new TwoHandedSword().amountOfDamage()).isEqualTo(5);
    }

}


