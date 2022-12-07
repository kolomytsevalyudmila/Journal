
package journal;

import java.util.ArrayList;


public class Subject {
    private int itemsNumber;
    private String itemsName;
    private String direction;

    public Subject() {
    }

    public Subject(int itemsNumber, String itemsName) {
        this.itemsNumber = itemsNumber;
        this.itemsName = itemsName;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    @Override
    public String toString() {
        return "Items{" + "itemsNumber=" + itemsNumber + ", itemsName=" + itemsName + ", direction=" + direction + '}';
    }

    public int getItemsNumber() {
        return itemsNumber;
    }

    public void setItemsNumber(int itemsNumber) {
        this.itemsNumber = itemsNumber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    
}
