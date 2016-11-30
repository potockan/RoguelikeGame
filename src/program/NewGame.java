package program;

import logic.items.equipment.LeatherArmor;
import logic.items.use.HealthPotion;
import logic.heros.Hero;
import logic.items.use.LevelPotion;
import logic.items.Item;

/**
 * Created by npotocka on 28.11.16.
 */
public class NewGame {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.displayHero();
        hero1.addInventory(new LevelPotion());
        hero1.displayHero();
        hero1.addInventory(new HealthPotion());
        hero1.displayHero();
        hero1.useItem(hero1.getInventory().get(0));
        hero1.displayHero();
        hero1.addInventory(new LeatherArmor());
        hero1.displayHero();
        hero1.useItem(hero1.getInventory().get(1));
        hero1.displayHero();
        hero1.useItem(hero1.getInventory().get(0));
        hero1.displayHero();
    }
}
