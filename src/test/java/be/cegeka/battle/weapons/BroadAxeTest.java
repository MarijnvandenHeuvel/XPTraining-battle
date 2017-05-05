package be.cegeka.battle.weapons;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BroadAxeTest {

    @Test
    public void amountOfDamage_shouldReturn4() {
        assertThat(new BroadAxe().amountOfDamage()).isEqualTo(5);
    }

}