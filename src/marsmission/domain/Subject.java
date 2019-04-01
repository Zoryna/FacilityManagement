package marsmission.domain;

public interface Subject {

    public void addObserver(Inspection ins);

    public void removeObserver(Inspection ins);

    public void notifyObservers(){ //tells the Observer the change
}
