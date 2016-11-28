package logic;

/**
 * Created by npotocka on 28.11.16.
 */
public class HealthPotion extends Potion{
    @Override
    public String getItemName() {
        return "Potion of Health";
    }

    @Override
    public void use(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
    }
}
