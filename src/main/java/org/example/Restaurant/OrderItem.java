package org.example.Restaurant;

public class OrderItem {
    private MenuItem menuItem;
    private String specialRequest;

    public OrderItem(MenuItem menuItem, String specialRequest) {
        this.menuItem = menuItem;
        this.specialRequest = specialRequest;
    }

    public double calculateCost(){
        return menuItem.getPrice();
    }

    @Override
    public String toString() {
        return menuItem.getName() + " (" + specialRequest + ")";
    }
}
