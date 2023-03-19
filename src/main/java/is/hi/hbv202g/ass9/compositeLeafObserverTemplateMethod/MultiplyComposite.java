package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.NumberLeaf;
import is.hi.hbv202g.ass9.compositeLeafObservedByComposite.Observer;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite extends MathObject {
    private List<NumberLeaf> values;
 private int  lastObservedResult;
    public MultiplyComposite(){
        super();
        mathExpression = new MathExpression() {
            @Override
            public int getResult(int a, int b) {
                return a * b;
            }
        };
    }


}
