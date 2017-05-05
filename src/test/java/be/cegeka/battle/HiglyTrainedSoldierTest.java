package be.cegeka.battle;

import be.cegeka.battle.weapons.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HiglyTrainedSoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new HiglyTrainedSoldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new HiglyTrainedSoldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new HiglyTrainedSoldier("   ");
    }

    @Test
    public void SoldierHasOnlyOneWeaponCanBeGivenAsParameterTwoHandedSword() throws Exception {
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name",new TwoHandedSword());
        assertThat(soldier.getWeapon()).isEqualTo("Two Handed Sword");
    }

    @Test
    public void SoldierHasOnlyOneWeaponCanBeGivenAsParameterBroadAxe() throws Exception {
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name",new BroadAxe());
        assertThat(soldier.getWeapon()).isEqualTo("Broad Axe");
    }

    @Test
    public void SoldierHasOnlyOneWeaponCanBeGivenAsParameterTrident() throws Exception {
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name",new Trident());
        assertThat(soldier.getWeapon()).isEqualTo("Trident");
    }

    @Test
    public void SoldierHasOnlyOneWeaponCanBeGivenAsParameterMagicPotion() throws Exception {
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name",new MagicPotion());
        assertThat(soldier.getWeapon()).isEqualTo("Magic Potion");
    }

    @Test
    public void SoldierFightsWithMagicPotionEvenWeapon_ThenWinsFight(){
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name",new MagicPotion());
        Soldier otherSoldier = new Soldier("name",new Sword());

        assertThat(soldier.fight(otherSoldier)).isEqualTo(soldier);
    }

    @Test
    public void SoldierFightsWithMagicPotionOddWeapon_ThenLosesFight(){
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name",new MagicPotion());
        Soldier otherSoldier = new Soldier("name",new Axe());

        assertThat(soldier.fight(otherSoldier)).isEqualTo(otherSoldier);
    }

    @Test
    public void SoldierFightsWithMagicPotionVSMagicPotion_ThenWinsFight(){
        HiglyTrainedSoldier soldier = new HiglyTrainedSoldier("name",new MagicPotion());
        HiglyTrainedSoldier otherSoldier = new HiglyTrainedSoldier("name",new MagicPotion());

        assertThat(soldier.fight(otherSoldier)).isEqualTo(soldier);
    }
}
