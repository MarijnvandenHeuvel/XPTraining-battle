package be.cegeka.battle.weapons;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MagicPotionTest {
    @Test
    public void amountOfDamage() throws Exception {
        assertThat(new MagicPotion().amountOfDamage()).isEqualTo(10);
    }

}