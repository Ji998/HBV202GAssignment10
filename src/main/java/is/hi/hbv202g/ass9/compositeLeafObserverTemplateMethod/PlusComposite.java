package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;


import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends MathObject {
    public PlusComposite(){
        super();
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
}
