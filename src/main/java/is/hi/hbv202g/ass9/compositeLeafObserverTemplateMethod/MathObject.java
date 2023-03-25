package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class MathObject implements MathExpression, Observer {
    protected List<NumberLeaf> values;

    public MathObject(){
        values = new ArrayList<NumberLeaf>();
    }

    public void add(NumberLeaf value){
        values.add(value);
    }

    public abstract void update(Observable o, Object arg);
}
