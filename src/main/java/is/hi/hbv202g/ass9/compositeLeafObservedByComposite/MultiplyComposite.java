package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression,Observer {

    List<MathExpression> values;
    private int lastObservedResult;
    public MultiplyComposite(){
        values = new ArrayList<MathExpression>();
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression value: values){
            result *= value.getResult();
        }
        return result;
    }

    public void add(MathExpression value){
        values.add(value);
    }

    @Override
    public void update() {
       int result = getResult();
        lastObservedResult=result;
        System.out.println("The result of ("+lastObservedResult+")*"+values.get(0).getResult()+" is: "+ result);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
