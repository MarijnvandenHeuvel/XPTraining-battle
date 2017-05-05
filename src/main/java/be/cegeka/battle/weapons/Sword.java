package be.cegeka.battle.weapons;

public class Sword implements Weapon {
    private String name="Sword";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() {
        return 2;
    }
}

