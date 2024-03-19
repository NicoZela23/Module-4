package org.example.ProductSellStrategy;

import java.util.ArrayList;
import java.util.List;

public class ItemGenerator {
    public List<ItemDTO> generateItems() {
        List<ItemDTO> items = new ArrayList<>();

        items.add(new ItemDTO("Ergonomic chairs", 2500, 30));
        items.add(new ItemDTO("Computer table", 3500, 20));
        items.add(new ItemDTO("Gaming headphones", 2100, 40));
        items.add(new ItemDTO("Mechanic keyboard", 1200, 50));
        items.add(new ItemDTO("Rode microphone", 1800, 12));

        return items;
    }
}
