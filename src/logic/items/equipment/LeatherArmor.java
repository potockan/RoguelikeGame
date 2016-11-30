package logic.items.equipment;

import logic.heros.Hero;

/**
 * Created by npotocka on 28.11.16.
 */
public class LeatherArmor extends Armor implements Equippable{
    @Override
    public String getItemName() {
        return "Leather Armor";
    }

    @Override
    public void equip(Hero hero) {
        System.out.format("Using %s\n", this.getItemName());
        hero.setArmor(hero.getArmor() + 10);
    }
}
