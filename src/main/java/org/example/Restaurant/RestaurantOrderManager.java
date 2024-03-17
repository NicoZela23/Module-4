package org.example.Restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantOrderManager {
    private Map<Integer, Order> tableOrders;
    private RestaurantMenu menu;

    public RestaurantOrderManager() {
        tableOrders = new HashMap<>();
        menu = new RestaurantMenu();
        menu.initializeMenu();
    }

    public Order takeOrder(Scanner scanner) {
        System.out.print("Enter table number: ");
        int tableNumber = scanner.nextInt();
        scanner.nextLine();

        Order order = new Order();
        while (true) {
            System.out.print("Enter menu item name (or 'done' to finish): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            MenuItem item = menu.getMenuItemByName(itemName);
            if (item != null) {
                System.out.print("Special request (if any): ");
                String specialRequest = scanner.nextLine();
                order.addItem(new OrderItem(item, specialRequest));
            } else {
                System.out.println("Item not found in the menu.");
            }
        }
        return order;
    }

    public void assignOrderToTable(Scanner scanner) {
        Order order = takeOrder(scanner);
        if (order != null) {
            System.out.print("Enter table number: ");
            int tableNumber = scanner.nextInt();
            scanner.nextLine();

            tableOrders.put(tableNumber, order);
            System.out.println("Order assigned to table " + tableNumber);
        } else {
            System.out.println("Order could not be created.");
        }
    }

    public void clearTable(Scanner scanner) {
        System.out.print("Enter table number to clear: ");
        int tableToClear = scanner.nextInt();
        scanner.nextLine();

        if (tableOrders.containsKey(tableToClear)) {
            tableOrders.remove(tableToClear);
            System.out.println("Table " + tableToClear + " cleared.");
        } else {
            System.out.println("No order found for table " + tableToClear);
        }
    }
}

