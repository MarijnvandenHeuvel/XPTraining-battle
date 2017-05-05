package be.cegeka.battle;

import be.cegeka.battle.weapons.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void SoldierHasOnlyOneWeaponDefaultBareFist() throws Exception {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getWeapon()).isEqualTo("Bare fist");
    }

    @Test
    public void SoldierHasOnlyOneWeaponCanBeGivenAsParameterAxe() throws Exception {
        Soldier soldier = new Soldier("name",new Axe());

        assertThat(soldier.getWeapon()).isEqualTo("Axe");
    }

    @Test
    public void SoldierHasOnlyOneWeaponCanBeGivenAsParameterSpear() throws Exception {
        Soldier soldier = new Soldier("name",new Spear());

        assertThat(soldier.getWeapon()).isEqualTo("Spear");
    }

    @Test
    public void SoldierHasOnlyOneWeaponCanBeGivenAsParameterSword() throws Exception {
        Soldier soldier = new Soldier("name",new Sword());
        assertThat(soldier.getWeapon()).isEqualTo("Sword");
    }

    @Test
    public void SoldierFightsWithHighestWeapon_ThenWinsFight(){
        Soldier soldier = new Soldier("name",new Axe());
        Soldier otherSoldier = new Soldier("name",new Sword());

        assertThat(soldier.fight(otherSoldier)).isEqualTo(soldier);
    }

    @Test
    public void SoldierFightsWithLowestWeaponDamage_ThenLosesFight(){
        Soldier soldier = new Soldier("name");
        Soldier otherSoldier = new Soldier("name",new Spear());

        assertThat(soldier.fight(otherSoldier)).isEqualTo(otherSoldier);
    }

    @Test
    public void SoldierFightsWithEqualWeaponDamage_ThenWinsFight(){
        Soldier soldier = new Soldier("name",new Spear());
        Soldier otherSoldier = new Soldier("name",new Sword());

        assertThat(soldier.fight(otherSoldier)).isEqualTo(soldier);
    }
}