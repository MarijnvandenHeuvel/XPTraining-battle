package be.cegeka.battle.weapons;

public class TwoHandedSword implements Weapon {
    private String name="Two Handed Sword";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() { return 5; }
}
