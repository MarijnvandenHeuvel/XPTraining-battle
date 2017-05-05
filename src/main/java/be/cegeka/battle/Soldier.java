package be.cegeka.battle;

import be.cegeka.battle.weapons.BareFist;
import be.cegeka.battle.weapons.Weapon;
import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private final String name;
    private Weapon weapon;
    private SoldierId id;

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
        int ownDamage = this.weapon.amountOfDamage();
        int otherDamage = otherSoldier.weapon.amountOfDamage();
        return (ownDamage >= otherDamage) ? this: otherSoldier;
    }

    public SoldierId getId() {
        return id;
    }

    public void addId(SoldierId soldierId) {
        this.id = soldierId;
    }
}
