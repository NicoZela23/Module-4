package org.example.DRY_example;

public class PalindromeCondition implements ICondition{
    @Override
    public boolean Eval(int x) {
        String inverted = invert(x+"");
        return inverted.equals(x+"");
    }
    static String invert(String s){
        String result = "";
        for (char x : s.toCharArray()){
            result = x + result;
        }
        return result;
    }
}
