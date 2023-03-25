package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpression {
    private int value;
    private boolean isChanged = false;

    public NumberLeaf(int value) {
        this.value = value;
    }

    @Override
    public int getResult() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setState(true);
    }

    public boolean getState(){
        return isChanged;
    }

    public void setState(boolean state){
        isChanged = state;
        notifyObservers();
        isChanged = false;
    }
}
