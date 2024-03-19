package org.example.ProductSellStrategy;

public class SellByDozen implements SellStrategy{
    final static int DOZEN = 12;
    final static int TEN = 10;
    @Override
    public int sell(ItemDTO item, int quantity) {
        int totalAmount = quantity * DOZEN;
        if (totalAmount <= item.getAmountInStorage()){
            item.setAmountInStorage(item.getAmountInStorage() - totalAmount);
            return quantity * TEN * item.getPrice();
        }
        return 0;
    }
}
