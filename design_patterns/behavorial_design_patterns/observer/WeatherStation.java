package design_patterns.behavorial_design_patterns.observer;

import design_patterns.behavorial_design_patterns.observer.displays.CurrentConditionsDisplay;
import design_patterns.behavorial_design_patterns.observer.displays.ForecastDisplay;
import design_patterns.behavorial_design_patterns.observer.displays.StatsDisplay;
import design_patterns.behavorial_design_patterns.observer.subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {

        // ? provider
        WeatherData weatherData = new WeatherData();

        // ? subscribers
        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
        StatsDisplay statsDisplay = new StatsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // weatherData.setMeasurements(80, 65, 30.4f);
        // weatherData.setMeasurements(90, 45, 50.4f);

        forecastDisplay.unregisterToGetUpdates();
        weatherData.setMeasurements(70, 55, 40.4f);

    }
}
