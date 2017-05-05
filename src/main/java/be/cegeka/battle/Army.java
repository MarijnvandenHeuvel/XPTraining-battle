package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<Soldier> soldiers = new ArrayList<>();

    public Soldier getFrontMan() {
        return soldiers.get(0);
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public be.cegeka.battle.Army EngageInWar(be.cegeka.battle.Army otherArmy) {
        //get first soldier of both armies
        //fight
        //remove lost soldier from armyList
        //continue until one army is empty
        return this;
    }
}
