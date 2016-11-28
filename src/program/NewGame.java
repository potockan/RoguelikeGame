package program;

import logic.HealthPotion;
import logic.Hero;
import logic.LevelPotion;
import logic.Item;

import java.util.ArrayList;

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
        ArrayList<Item> inv= hero1.getInventory();
        //hero1.getInventory()[0].use(hero1);
    }
}
