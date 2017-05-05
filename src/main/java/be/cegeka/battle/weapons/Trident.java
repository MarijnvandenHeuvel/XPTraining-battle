package be.cegeka.battle.weapons;

public class Trident extends Spear {
    private String name="Trident";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() { return super.amountOfDamage()*3; }
}
