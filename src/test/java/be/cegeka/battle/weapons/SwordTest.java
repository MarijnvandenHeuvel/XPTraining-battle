package be.cegeka.battle.weapons;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTest {
    @Test
    public void amountOfDamage() throws Exception {
        Assertions.assertThat(new Sword().amountOfDamage()).isEqualTo(2);
    }

}