package logic.items;

/**
 * Created by npotocka on 28.11.16.
 */
public abstract class Item {
    public abstract String getItemName();

    @Override
    public String toString() {
        return getItemName();
    }
}
