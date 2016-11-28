package logic;

/**
 * Created by npotocka on 28.11.16.
 */
public class LevelPotion extends Potion {
    @Override
    public String getItemName() {
        return "Potion of Level Up";
    }

    @Override
    public void use(Hero hero) {
        hero.setLevel(hero.getLevel() + 1);
    }
}
