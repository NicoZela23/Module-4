package org.example.ProductSellStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ItemGenerator productList = new ItemGenerator();
        List<ItemDTO> items = productList.generateItems();
        //Manages the purchases in the list
        ProductPurchase productPurchase = new ProductPurchase(items);

        SellManager sellManager = new SellManager();
        sellManager.setStrategy(new SellByUnit());

        productPurchase.sellItem("Computer table", 5, sellManager);
        sellManager.setStrategy(new SellByDozen());

        productPurchase.sellItem("Rode microphone", 1, sellManager);
    }
}
