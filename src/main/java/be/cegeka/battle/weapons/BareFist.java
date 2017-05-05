package be.cegeka.battle.weapons;

public class BareFist implements Weapon {
    private String name="Bare fist";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() {
        return 1;
    }
}
