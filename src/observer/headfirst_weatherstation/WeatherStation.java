package observer.headfirst_weatherstation;

import observer.headfirst_weatherstation.displays.CurrentConditionsDisplay;
import observer.headfirst_weatherstation.displays.HeatIndexDisplay;
import observer.headfirst_weatherstation.displays.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new HeatIndexDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        weatherData.setValues(80, 65, 30.4);

        new CurrentConditionsDisplay(weatherData);
        weatherData.setValues(78, 90, 29.2);
        weatherData.setValues(82, 70, 29.2);
    }
}
