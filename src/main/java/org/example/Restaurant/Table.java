package org.example.Restaurant;

public class Table {
    private int tableNumber;
    private Order currentOrder;
    private TableStatus status;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.status = TableStatus.VACANT;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void assignOrder(Order order) {
        currentOrder = order;
        status = TableStatus.OCCUPIED;
    }

    public void clearTable() {
        currentOrder = null;
        status = TableStatus.VACANT;
    }

    public void displayTableStatus() {
        System.out.println("Table " + tableNumber + ": " + status);
    }
}
