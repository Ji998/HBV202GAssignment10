package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    List<MathExpression> values;



    public PlusComposite(){
        values = new ArrayList<MathExpression>();
    }

    public void add(MathExpression value){
        values.add(value);
    }

    public int getResult() {
        int result = 0;
        for(MathExpression value : values){
            result += value.getResult();
        }
        return result;
    }

    public void update(){
        for(MathExpression value : values){
            System.out.println(value.getResult());
        }
    }
}
