package org.example.DRY_example;

public class NegatorCondition implements ICondition{
    ICondition originalCondition;

    public NegatorCondition(ICondition originalCondition) {
        this.originalCondition = originalCondition;
    }

    @Override
    public boolean Eval(int x) {
        return !originalCondition.Eval(x);
    }
}
