package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ArmyTest {

    @Test
    public void getFrontMan() throws Exception {
        Army army = new Army();
        Soldier soldier1 = new Soldier("name");
        Soldier soldier2 = new Soldier("name");
        Soldier soldier3 = new Soldier("name");
        Soldier soldier4 = new Soldier("name");

        army.addSoldier(soldier1);
        army.addSoldier(soldier2);
        army.addSoldier(soldier3);
        army.addSoldier(soldier4);

        assertThat(army.getFrontMan()).isEqualTo(soldier1);

    }

}