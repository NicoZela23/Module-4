package org.example.DRY_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public static List<Integer> numberGenerator()
    {
        List<Integer> numberList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            numberList.add(rand.nextInt(100));
        }
        return numberList;
    }
}
