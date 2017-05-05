package be.cegeka.battle;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class ArmyTest {
    @Rule
   public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks
    Army army;

    @Mock
    HeadQuarters headQuartersMock;

    @Test
    public void getFrontMan() throws Exception {
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

    @Test
    public void addSoldier_isEnlistedInHQ() {
        Soldier soldier1 = new Soldier("name");

        when(headQuartersMock.reportEnlistment(soldier1)).thenReturn(1);

        army.addSoldier(soldier1);

        assertThat(soldier1.getId()).isEqualToComparingFieldByField(new SoldierId(1));
    }

}