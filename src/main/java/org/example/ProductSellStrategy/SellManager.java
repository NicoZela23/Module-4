package org.example.ProductSellStrategy;

public class SellManager {
    private SellStrategy strategy;

public void setStrategy (SellStrategy strategy){
    this.strategy = strategy;
}
    public int processPurchase(ItemDTO item, int quantity){
        return strategy.sell(item, quantity);
    }
}
