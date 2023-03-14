package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends MathExpression {
    List<NumberLeaf> values;

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
        for(NumberLeaf value : values){
            System.out.println(value.getResult());
        }
    }
}
