package marsmission.domain;

public interface Observable {
    public void addObserver(Observer o); // Adds an observer to the set of observers for this object, provided that it is not the same as some observer already in the set.
    public boolean hasChanged(); // Tests if this object has changed.
    public void deleteObserver(Observer o); // Deletes an observer from the set of observers of this object.
    public void notify(Observer o); // If this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed.
    public void setChanged(); // Marks this Observable object as having been changed; the hasChanged method will now return true.
}
