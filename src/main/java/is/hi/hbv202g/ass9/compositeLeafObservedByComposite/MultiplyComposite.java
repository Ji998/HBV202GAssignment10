package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {

    List<NumberLeaf> values;

    public MultiplyComposite(){
        values = new ArrayList<NumberLeaf>();
    }

    @Override
    public int getResult() {
        int result = 0;
        for (NumberLeaf value: values){
            result *= value.getResult();
        }
        return result;
    }

    public void add(NumberLeaf value){
        values.add(value);
    }
}
