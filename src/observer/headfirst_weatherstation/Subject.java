package observer.headfirst_weatherstation;

public interface Subject {
    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyListeners();
}
