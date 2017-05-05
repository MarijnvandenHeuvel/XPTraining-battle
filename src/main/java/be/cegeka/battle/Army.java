package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<Soldier> soldiers;
    private HeadQuarters headQuarter;

    public Army(HeadQuarters headQuarters) {
        soldiers = new ArrayList<>();
        this.headQuarter = headQuarters;
    }

    public Soldier getFrontMan() {
        return !soldiers.isEmpty() ? soldiers.get(0) :  null;
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
        SoldierId soldierId = new SoldierId(headQuarter.reportEnlistment(soldier));
        soldier.addId(soldierId);
    }

    public Army EngageInWar(Army otherArmy) {
        while(soldiersLeftInArmy(this)){
            if(!soldiersLeftInArmy(otherArmy)){break;}
            fightWithArmy(otherArmy);
        }
        return soldiersLeftInArmy(this) ? this : otherArmy;
    }

    private void fightWithArmy(Army otherArmy) {
        Soldier myFrontMan = this.getFrontMan();
        Soldier otherFrontMan = otherArmy.getFrontMan();
        if(FrontmenArePresent(myFrontMan, otherFrontMan)) {
            Soldier winner = myFrontMan.fight(otherFrontMan);

            if(myFrontMan.equals(winner)){
                otherArmy.soldiers.remove(otherFrontMan);
            } else {
                this.soldiers.remove(myFrontMan);
            }
        }
    }

    private boolean FrontmenArePresent(Soldier myFrontMan, Soldier otherFrontMan) {
        return myFrontMan != null && otherFrontMan != null;
    }

    private boolean soldiersLeftInArmy(Army army){
        return !army.soldiers.isEmpty();
    }
}

