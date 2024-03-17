package org.example.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Table> tables;
    private Menu menu;

    public RestaurantManager() {
        tables = new ArrayList<>();
        menu = new Menu();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void assignOrderToTable(int tableNumber, Order order) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                table.assignOrder(order);
                break;
            }
        }
    }

    public void clearTable(int tableNumber) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                table.clearTable();
                break;
            }
        }
    }

    public void displayTableStatus() {
        System.out.println("Table Status:");
        for (Table table : tables) {
            table.displayTableStatus();
        }
    }
}
