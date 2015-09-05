package observer;

import observer.visualelements.CurrentConditionsDisplay;

/**
 * Created by root on 30.08.15.
 */
public class Main {

    public static void main(String... args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(1.0f, 2.0f, 3.0f);
        weatherData.setMeasurements(1.1f, 2.1f, 3.1f);
        weatherData.setMeasurements(1.2f, 2.2f, 3.2f);
    }
}
