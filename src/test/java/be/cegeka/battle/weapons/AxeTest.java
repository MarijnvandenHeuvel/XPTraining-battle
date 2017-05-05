package be.cegeka.battle.weapons;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AxeTest {

    @Test
    public void amountOfDamage_shouldReturn3() {
        Assertions.assertThat(new Axe().amountOfDamage()).isEqualTo(3);
    }

}