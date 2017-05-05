package be.cegeka.battle.weapons;

public class BroadAxe extends Axe {
    private String name="Broad Axe";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int amountOfDamage() { return super.amountOfDamage()+2; }
}
