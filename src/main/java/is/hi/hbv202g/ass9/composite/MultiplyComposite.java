package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {

    List<MathExpression> values;


    public MultiplyComposite(){
        values = new ArrayList<MathExpression>();
    }

    public int getResult() {
        int result = 0;
        for (MathExpression value: values){
            result *= value.getResult();
        }
        return result;
    }

    public void add(MathExpression value){
        values.add(value);
    }
}
