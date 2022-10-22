package observer.headfirst_weather_station;

public interface Observer {
    public void update(double temp, double humidity, double pressure);
}
