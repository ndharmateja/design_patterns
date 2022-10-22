package observer.headfirst_weather_station;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements DisplayElement, Observer {
    List<Double> temperatures;
    WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperatures.add(temp);
        display();
    }

    @Override
    public void display() {
        double averageTemp = temperatures.stream().mapToDouble(d -> d.doubleValue()).sum()
                / temperatures.stream().count();
        double minTemp = Double.MAX_VALUE;
        double maxTemp = Double.MIN_VALUE;

        for (double temp : this.temperatures) {
            if (temp > maxTemp)
                maxTemp = temp;
            if (temp < minTemp)
                minTemp = temp;
        }

        System.out.println(String.format(
                "Statistics Display: Avg/max/min temperatures are %.2f F/%.2f F/%.2f F", averageTemp, maxTemp,
                minTemp));

    }

}
