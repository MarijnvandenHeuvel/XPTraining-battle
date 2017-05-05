package be.cegeka.battle.weapons;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    @Test
    public void amountOfDamage_shouldReturn3() {
        Assertions.assertThat(new Axe().amountOfDamage()).isEqualTo(3);
    }

}