package be.cegeka.battle.weapons;

public class MagicPotion implements Weapon {
    private String name="Magic Potion";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() { return 10; }
}
