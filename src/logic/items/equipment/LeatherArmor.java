package logic.items.equipment;

import logic.heros.Hero;
import logic.items.use.Armor;

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
        hero.setArmor(hero.getArmor() + 10);
    }
}
