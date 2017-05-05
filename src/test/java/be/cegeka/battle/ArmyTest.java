package be.cegeka.battle;


import be.cegeka.battle.weapons.Axe;
import be.cegeka.battle.weapons.BareFist;
import be.cegeka.battle.weapons.Spear;
import be.cegeka.battle.weapons.Sword;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {

    private HeadQuarters createHeadQuarters(int i) {
        return new HeadQuarters() {
            @Override
            public int reportEnlistment(Soldier soldier) {
                return i;
            }
        };
    }


    @Test
    public void getFrontMan() throws Exception {
        Army army = new Army(createHeadQuarters(5));

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
        Army army = new Army(createHeadQuarters(5));

        Soldier soldier1 = new Soldier("name");

        army.addSoldier(soldier1);

        assertThat(soldier1.getId()).isEqualToComparingFieldByField(new SoldierId(5));
    }

    @Test
    public void EngageInWarWithOtherArmy_WhenStrongestArmy_ThenArmyWins() throws Exception {
        Army myArmy = new Army(createHeadQuarters(5));
        Army otherArmy = new Army(createHeadQuarters(5));

        Soldier soldier1 = new Soldier("name", new Axe());
        Soldier soldier2 = new Soldier("name", new Spear());
        Soldier soldier3 = new Soldier("name", new Sword());
        Soldier soldier4 = new Soldier("name", new Sword());

        myArmy.addSoldier(soldier1);
        myArmy.addSoldier(soldier2);
        otherArmy.addSoldier(soldier3);
        otherArmy.addSoldier(soldier4);

        assertThat(myArmy.EngageInWar(otherArmy)).isEqualTo(myArmy);
    }

    @Test
    public void EngageInWarWithOtherArmy_WhenWeakestArmy_ThenArmyLoses() throws Exception {
        Army myArmy = new Army(createHeadQuarters(5));
        Army otherArmy = new Army(createHeadQuarters(5));
        Soldier soldier1 = new Soldier("name", new BareFist());
        Soldier soldier2 = new Soldier("name", new BareFist());
        Soldier soldier3 = new Soldier("name", new Sword());
        Soldier soldier4 = new Soldier("name", new Sword());

        myArmy.addSoldier(soldier1);
        myArmy.addSoldier(soldier2);
        otherArmy.addSoldier(soldier3);
        otherArmy.addSoldier(soldier4);

        assertThat(myArmy.EngageInWar(otherArmy)).isEqualTo(otherArmy);
    }

    @Test
    public void EngageInWarWithOtherArmy_WhenEqualArmy_ThenArmyWins() throws Exception {
        Army myArmy = new Army(createHeadQuarters(5));
        Army otherArmy = new Army(createHeadQuarters(5));
        Soldier soldier1 = new Soldier("name");
        Soldier soldier2 = new Soldier("name");
        Soldier soldier3 = new Soldier("name");
        Soldier soldier4 = new Soldier("name");

        myArmy.addSoldier(soldier1);
        myArmy.addSoldier(soldier2);
        otherArmy.addSoldier(soldier3);
        otherArmy.addSoldier(soldier4);

        assertThat(myArmy.EngageInWar(otherArmy)).isEqualTo(myArmy);
    }

    @Test
    public void EngageInWarWithOtherArmy_WhenBothArmiesAreEmpty_ThenDefendingArmyWins() throws Exception {
        Army myArmy = new Army(createHeadQuarters(5));
        Army otherArmy = new Army(createHeadQuarters(5));

        assertThat(myArmy.EngageInWar(otherArmy)).isEqualTo(otherArmy);
    }

    @Test
    public void EngageInWarWithOtherArmy_WhenMyArmyIsEmpty_ThenOtherArmyWins() throws Exception {
        Army myArmy = new Army(createHeadQuarters(5));
        Army otherArmy = new Army(createHeadQuarters(5));
        Soldier soldier3 = new Soldier("name");
        Soldier soldier4 = new Soldier("name");

        otherArmy.addSoldier(soldier3);
        otherArmy.addSoldier(soldier4);

        assertThat(myArmy.EngageInWar(otherArmy)).isEqualTo(otherArmy);
    }

    @Test
    public void EngageInWarWithOtherArmy_WhenOtherArmyIsEmpty_ThenMyArmyWins() throws Exception {
        Army myArmy = new Army(createHeadQuarters(5));
        Army otherArmy = new Army(createHeadQuarters(5));
        Soldier soldier3 = new Soldier("name");
        Soldier soldier4 = new Soldier("name");

        myArmy.addSoldier(soldier3);
        myArmy.addSoldier(soldier4);

        assertThat(myArmy.EngageInWar(otherArmy)).isEqualTo(myArmy);
    }

}