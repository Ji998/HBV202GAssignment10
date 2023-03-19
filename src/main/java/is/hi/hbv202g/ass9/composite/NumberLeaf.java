package is.hi.hbv202g.ass9.composite;

import is.hi.hbv202g.ass9.composite.MathExpression;

public class NumberLeaf implements MathExpression {
    private int value;

    public NumberLeaf() {
    }
    public NumberLeaf(int value) {
        this.value = value;
    }

    public int getResult() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
