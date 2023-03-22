package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

public class PlusComposite extends MathObject {
    public PlusComposite() {
        super();
        mathExpression = new MathExpression() {
            @Override
            public int getResult(int a, int b) {
                return a + b;
            }
        };
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
