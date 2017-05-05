package be.cegeka.battle.weapons;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AxeTest {

    @Test
    public void amountOfDamage_shouldReturn3() {
        assertThat(new Axe().amountOfDamage()).isEqualTo(3);
    }
}