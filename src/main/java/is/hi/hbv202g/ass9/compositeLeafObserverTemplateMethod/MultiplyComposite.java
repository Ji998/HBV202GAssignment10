package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.MathExpression;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {

    List<is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf> values;
 private int  lastObservedResult;
    public MultiplyComposite(){
        values = new ArrayList<is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf>();
    }

    @Override
    public int getResult() {
        int result = 0;
        for (is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf value: values){
            result *= value.getResult();
        }
        return result;
    }

    public void add(is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf value){
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
