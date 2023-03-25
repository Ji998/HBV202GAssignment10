package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class MathObject implements MathExpression, Observer {
    protected List<MathExpression> values;

    protected int lastObservedResult;

    MathObject(){
        values = new ArrayList<MathExpression>();
        lastObservedResult = 0;
    }

    public void add(MathExpression value){
        values.add(value);
    }

    public void update() {
        int result = 0;
        lastObservedResult = result;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
