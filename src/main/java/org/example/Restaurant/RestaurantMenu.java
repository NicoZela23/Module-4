package org.example.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {
    private List<MenuItem> menuItems;

    public void initializeMenu() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Burger", 10.99, "Juicy beef patty with cheese"));
        menuItems.add(new MenuItem("Pasta", 12.49, "Classic spaghetti with marinara sauce"));
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    public MenuItem getMenuItemByName(String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}

