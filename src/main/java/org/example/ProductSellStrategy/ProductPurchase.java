package org.example.ProductSellStrategy;

import java.util.List;

public class ProductPurchase {
    private final List<ItemDTO> items;
    public ProductPurchase(List<ItemDTO> items) {
        this.items = items;
    }
    public void sellItem(String itemName, int quantity, SellManager sellManager) {
        for (ItemDTO item : items) {
            if (item.getName().equals(itemName)) {
                int totalPrice = sellManager.processPurchase(item, quantity);
                if (totalPrice > 0) {
                    System.out.println("Sale successful for " + itemName + ". Total price: " + totalPrice);
                }
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }
}
