package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class MathObject implements Observer {
    protected List<NumberLeaf> values;

    protected MathExpression mathExpression;

    protected int lastObservedResult;

    public MathObject(){
        values = new ArrayList<NumberLeaf>();
        lastObservedResult = 0;
    }

    public void add(NumberLeaf value){
        values.add(value);
    }

    @Override
    public void update() {
        int result = 0;
        for (NumberLeaf value: values){
            result = mathExpression.getResult(result, value.getResult());
        }
        lastObservedResult = result;
        System.out.println("The result of ("+lastObservedResult+")*"+values.get(0).getResult()+" is: "+ result);



    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    public abstract void update(Observable o, Object arg);
}
