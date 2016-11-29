package program;

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
        Item it1 = hero1.getInventory().get(0);
        System.out.println(it1);
        //it1.use(hero1); // nie dziala, bo it1 typu Item!
    }
}
