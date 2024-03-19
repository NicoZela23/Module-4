package org.example.ProductSellStrategy;

public class SellByUnit implements SellStrategy{
    @Override
    public int sell(ItemDTO item, int quantity) {
        if (quantity <= item.getAmountInStorage()) {
            item.setAmountInStorage(item.getAmountInStorage() - quantity);
            return item.getPrice() * quantity;
        }
        return 0;
    }
}
