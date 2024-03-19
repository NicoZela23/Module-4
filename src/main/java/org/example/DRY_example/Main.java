package org.example.DRY_example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintCondition printCondition = new PrintCondition();
        List<Integer>numberList = NumberGenerator.numberGenerator();
        printCondition.print("All", numberList, new GeneralCondition());
        printCondition.print("Even", numberList, new MultipleCondition(2));
        printCondition.print("Odd", numberList, new NegatorCondition(new MultipleCondition(2)));
        printCondition.print("Fives", numberList, new MultipleCondition(5));
        printCondition.print("No Fives", numberList, new NegatorCondition(new MultipleCondition(5)));
        printCondition.print("Prime", numberList, new PrimeCondition());
        printCondition.print("Palindrome", numberList, new PalindromeCondition());
    }
}
