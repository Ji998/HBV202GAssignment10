package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class ConcreteObservable extends Observable{
    // EXAMPLE CODE : NUMBERLEAF MUST CHANGE TO A SIMILAR FORMAT
    protected Boolean isChanged = false;

    public boolean getState(){
        return isChanged;
    }


    public void setState(boolean state){
        isChanged = state;
        notifyObservers();
    }
}
