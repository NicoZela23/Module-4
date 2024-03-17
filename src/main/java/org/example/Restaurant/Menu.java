package org.example.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu(){
        menuItems = new ArrayList<>();
    }
    public void addMenuItem(MenuItem item){
        menuItems.add(item);
    }

    public void updateMenuItem(MenuItem item, double newPrice, String newDescription){
        for (MenuItem existingItem : menuItems) {
            if (existingItem.getName().equals(item.getName())) {
                existingItem.setPrice(newPrice);
                existingItem.setDescription(newDescription);
                break;
            }
        }
    }
    public MenuItem getMenuItemByName(String itemName) {
        for (MenuItem item : menuItems) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null; // Item not found
    }
    public void displayMenu(){
        System.out.println("Menu");
        for (MenuItem item : menuItems){
            System.out.println(item);
        }
    }
}
