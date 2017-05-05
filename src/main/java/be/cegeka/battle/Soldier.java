package be.cegeka.battle;

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
}
