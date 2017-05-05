package be.cegeka.battle.weapons;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BareFistTest {
    @Test
    public void amountOfDamage() throws Exception {
        assertThat(new BareFist().amountOfDamage()).isEqualTo(1);
    }

}