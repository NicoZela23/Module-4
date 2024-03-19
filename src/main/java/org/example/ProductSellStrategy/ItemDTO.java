package org.example.ProductSellStrategy;

public class ItemDTO {
    private String name;
    private int price;
    private int amountInStorage;

    public ItemDTO(String name, int price, int amountInStorage) {
        this.name = name;
        this.price = price;
        this.amountInStorage = amountInStorage;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public int getAmountInStorage() {
        return amountInStorage;
    }

    public void setAmountInStorage(int amountInStorage) {
        this.amountInStorage = amountInStorage;
    }
}
