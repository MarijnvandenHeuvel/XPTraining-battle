package be.cegeka.battle.weapons;

public class Axe implements Weapon {
    private String name="Axe";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() {
        return 3;
    }
}
