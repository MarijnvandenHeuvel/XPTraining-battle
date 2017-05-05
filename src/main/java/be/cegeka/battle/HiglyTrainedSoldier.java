package be.cegeka.battle;

import be.cegeka.battle.weapons.Weapon;

public class HiglyTrainedSoldier extends Soldier{

    public HiglyTrainedSoldier(String name) {
        super(name);
    }

    public HiglyTrainedSoldier(String name, Weapon weapon) {
        super(name,weapon);
    }
}
