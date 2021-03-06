package logic.heros;

import logic.items.Item;
import logic.items.equipment.Equippable;
import logic.items.use.Usable;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by npotocka on 28.11.16.
 */
public class Hero {
    protected int level;
    protected int health;
    protected int armor;
    protected ArrayList<Item> inventory;

    public Hero(){
        this.level = 0;
        this.health = 100;
        this.armor = 50;
        this.inventory = new ArrayList<>();
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void addInventory(Item newItem){
        System.out.format("Adding %s to inventory\n", newItem.getItemName());
        this.inventory.add(newItem);
    }

    public void useItem(Usable item){
        item.use(this);
    }

    public void equipItem(Equippable eq){
        eq.equip(this);
    }

    @Override
    public String toString() {
        /*String strOut = "";
        for(Item item: inventory)
            strOut += item + ", ";*/
        // more effective way:
        //String inventoryOutput = Arrays.toString(inventory.toArray());
        // the most effective way:
        StringBuilder builder = new StringBuilder();
        for(Item item: inventory){
            builder.append(item);
            builder.append(", ");
        }
        return "Level: " + this.level +
                ", Health: " + this.health +
                ", Armor: " + this.armor +
                ", Inventory: " + builder.toString();
    }

    public void displayHero() {
        System.out.format("Level: %s, Health: %s, Armor: %s, Inventory: ",
                this.level, this.health, this.armor);
        for(Item item: inventory)
            System.out.format("%s, ", item);
        System.out.println();
    }

    public void useItem(Item item){
        if(item instanceof Usable){
            ((Usable) item).use(this);
            this.inventory.remove(item);
        }else{
            if(item instanceof Equippable){
                ((Equippable) item).equip(this);
                this.inventory.remove(item);
            }
        }
    }
}
