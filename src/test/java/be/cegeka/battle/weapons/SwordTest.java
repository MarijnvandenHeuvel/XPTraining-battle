package be.cegeka.battle.weapons;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwordTest {
    @Test
    public void amountOfDamage() throws Exception {
        assertThat(new Sword().amountOfDamage()).isEqualTo(2);
    }

}