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
}
