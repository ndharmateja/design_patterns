package observer.headfirst_weather_station.displays;

import observer.headfirst_weather_station.Observer;
import observer.headfirst_weather_station.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    double temperature;
    double humidity;
    WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println(
                String.format("Current conditions: Temperature is %.1fF and humidity is %.2f%%", this.temperature,
                        this.humidity));
    }

}
