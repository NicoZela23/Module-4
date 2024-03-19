package org.example.DRY_example;

public class MultipleCondition implements ICondition{
    public int num;

    public MultipleCondition(int num) {
        this.num = num;
    }

    @Override
    public boolean Eval(int x) {
        return x % num == 0;
    }
}
