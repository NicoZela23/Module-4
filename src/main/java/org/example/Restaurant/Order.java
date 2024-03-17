package org.example.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private boolean isCompleted;

    public Order() {
        items = new ArrayList<>();
        isCompleted = false;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void markItemCompleted(OrderItem item) {
    }

    public double calculateTotalBill() {
        double total = 0;
        for (OrderItem item : items){
            total += item.calculateCost();
        }
        return total;
    }
    public void displayOrder() {
        System.out.println("Order Items:");
        for (OrderItem item : items) {
            System.out.println(item);
        }
        System.out.println("Total Bill: $" + calculateTotalBill());
    }
}
