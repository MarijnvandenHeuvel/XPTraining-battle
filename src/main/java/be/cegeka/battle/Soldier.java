package be.cegeka.battle;

import be.cegeka.battle.weapons.BareFist;
import be.cegeka.battle.weapons.Weapon;
import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private final String name;
    private Weapon weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon=new BareFist();
    }

    public Soldier(String name,Weapon weapon) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon=weapon;
    }

    String getName() {
        return this.name;
    }

    public String getWeapon() {
        return weapon.getName();
    }

    public Soldier fight(Soldier otherSoldier){
        int ownDamage = determineWeaponDamage(this,otherSoldier);
        int otherDamage = determineWeaponDamage(otherSoldier,this);
        return (ownDamage >= otherDamage) ? this: otherSoldier;
    }

    public int determineWeaponDamage(Soldier soldier, Soldier otherSoldier){
        if(soldier.weapon.amountOfDamage()==10){
            return (otherSoldier.weapon.amountOfDamage()%2!=0) ? 0 : soldier.weapon.amountOfDamage();
        }
        return soldier.weapon.amountOfDamage();
    }
}
