package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.MathExpression;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    List<NumberLeaf> values;
    private int  lastObservedResult;

    public PlusComposite(){
        values = new ArrayList<NumberLeaf>();
    }

    public void add(NumberLeaf value){
        values.add(value);
    }

    @Override
    public int getResult() {
        int result = 0;
        for(NumberLeaf value : values){
            result += value.getResult();
        }
        return result;
    }

    public void update(){
        int result = 0;
        for(NumberLeaf value : values){
            result += value.getResult();


        }
        lastObservedResult=result;
        System.out.println("The result of ("+lastObservedResult+")+"+values.get(0).getResult()+" is: "+ result);
    }
}
