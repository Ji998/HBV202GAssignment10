package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression ,Observer{
    List<MathExpression> values;
    private int  lastObservedResult;

    public PlusComposite(){
        values = new ArrayList<MathExpression>();
    }

    public void add(MathExpression value){
        values.add(value);
    }

    @Override
    public int getResult() {
        int result = 0;
        for(MathExpression value : values){
            result += value.getResult();
        }
        return result;
    }

    public void update(){
        int result = getResult();
        lastObservedResult=result;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
