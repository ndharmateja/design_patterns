package observer.headfirst_weather_station;

public interface Subject {
    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyListeners();
}
