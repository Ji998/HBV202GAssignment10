package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite extends MathObject {
    public MultiplyComposite(){
        super();
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression value: values){
            result *= value.getResult();
        }
        return result;
    }

    @Override
    public void update() {
        int result = getResult();
        this.lastObservedResult=result;
    }
}
