package org.example.DRY_example;

import java.util.List;

public class PrintCondition {
    public void print(String message, List<Integer> data, ICondition condition){
        System.out.println(message);
        for (int i : data){
            if (condition.Eval(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
