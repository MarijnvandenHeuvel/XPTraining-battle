package be.cegeka.battle.weapons;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BareFistTest {
    @Test
    public void amountOfDamage() throws Exception {
        Assertions.assertThat(new BareFist().amountOfDamage()).isEqualTo(1);
    }

}