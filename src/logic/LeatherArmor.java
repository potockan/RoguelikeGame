package logic;

/**
 * Created by npotocka on 28.11.16.
 */
public class LeatherArmor extends Armor {
    @Override
    public String getItemName() {
        return "Leather Armor";
    }

    @Override
    public void equip(Hero hero) {
        hero.setArmor(hero.getArmor() + 10);
    }
}
