package marsmission.domain;

public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers(){ //tells the Observer the change
}
