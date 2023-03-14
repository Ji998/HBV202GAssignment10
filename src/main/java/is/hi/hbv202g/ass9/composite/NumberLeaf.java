package is.hi.hbv202g.ass9.composite;

import is.hi.hbv202g.ass9.composite.MathExpression;

public class NumberLeaf extends MathExpression {
    private int value;

    public NumberLeaf(int value) {
        this.value = value;
    }

    @Override
    public int getResult() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
