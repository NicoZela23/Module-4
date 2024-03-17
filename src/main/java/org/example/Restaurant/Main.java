package org.example.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantOrderManager orderManager = new RestaurantOrderManager();
        RestaurantMenu menu = new RestaurantMenu();
        menu.initializeMenu();

        while (true) {
            displayMenuOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    menu.displayMenu();
                    break;
                case 2:
                    Order order = orderManager.takeOrder(scanner);
                    orderManager.assignOrderToTable(scanner);
                    break;
                case 3:
                    orderManager.assignOrderToTable(scanner);
                    break;
                case 4:
                    orderManager.clearTable(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenuOptions() {
        System.out.println("\nRestaurant Order Management System");
        System.out.println("1. Display Menu");
        System.out.println("2. Take Order");
        System.out.println("3. Assign Order to Table");
        System.out.println("4. Clear Table");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}

