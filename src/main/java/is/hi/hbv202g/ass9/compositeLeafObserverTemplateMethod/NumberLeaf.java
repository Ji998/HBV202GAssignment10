package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.MathExpression;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observable;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;

public class NumberLeaf extends Observable implements MathExpression {
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
    public void addObserver(Observer observer){
        addObserver(observer);
    }

}
