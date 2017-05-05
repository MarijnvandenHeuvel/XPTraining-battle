package be.cegeka.battle.weapons;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpearTest {
    @Test
    public void amountOfDamage() throws Exception {
        Assertions.assertThat(new Spear().amountOfDamage()).isEqualTo(2);
    }

}