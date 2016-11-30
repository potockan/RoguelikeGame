package logic.items.use;

import logic.heros.Hero;

/**
 * Created by npotocka on 28.11.16.
 */
public class LevelPotion extends Potion implements Usable{
    @Override
    public String getItemName() {
        return "Potion of Level Up";
    }

    @Override
    public void use(Hero hero) {
        System.out.format("Using %s\n", this.getItemName());
        hero.setLevel(hero.getLevel() + 1);
    }
}
