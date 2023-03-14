package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression,Observer {

    List<NumberLeaf> values;
 private int  lastObservedResult;
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

    @Override
    public void update() {
       int result = 0;
        for (NumberLeaf value: values){
            result *= value.getResult();


        }
        lastObservedResult=result;
        System.out.println("The result of ("+lastObservedResult+")*"+values.get(0).getResult()+" is: "+ result);



    }


}
