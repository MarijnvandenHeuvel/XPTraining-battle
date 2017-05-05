package be.cegeka.battle.weapons;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpearTest {
    @Test
    public void amountOfDamage() throws Exception {
        assertThat(new Spear().amountOfDamage()).isEqualTo(2);
    }

}