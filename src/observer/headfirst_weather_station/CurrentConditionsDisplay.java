package observer.headfirst_weather_station;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    double temperature;
    double humidity;
    WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(
                String.format("Current conditions: Temperature is %.2fF and humidity is %f%%", this.temperature,
                        this.humidity));
    }

}
