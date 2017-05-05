package be.cegeka.battle.weapons;

public class Spear implements Weapon {
    private String name="Spear";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() {
        return 2;
    }
}
