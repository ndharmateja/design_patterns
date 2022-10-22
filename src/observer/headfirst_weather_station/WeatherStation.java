package observer.headfirst_weather_station;

import observer.headfirst_weather_station.displays.CurrentConditionsDisplay;
import observer.headfirst_weather_station.displays.HeatIndexDisplay;
import observer.headfirst_weather_station.displays.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setValues(80, 65, 30.4);

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setValues(78, 90, 29.2);
        weatherData.setValues(82, 70, 29.2);
    }
}
