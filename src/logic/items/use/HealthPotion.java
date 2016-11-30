package logic.items.use;

import logic.heros.Hero;

/**
 * Created by npotocka on 28.11.16.
 */
public class HealthPotion extends Potion implements Usable{
    @Override
    public String getItemName() {
        return "Potion of Health";
    }

    @Override
    public void use(Hero hero) {
        System.out.format("Using %s\n", this.getItemName());
        hero.setHealth(hero.getHealth() + 10);
    }
}
