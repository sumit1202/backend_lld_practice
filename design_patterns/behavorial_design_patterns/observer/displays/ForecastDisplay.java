package design_patterns.behavorial_design_patterns.observer.displays;

import design_patterns.behavorial_design_patterns.observer.observers.Observer;
import design_patterns.behavorial_design_patterns.observer.subjects.Subject;

public class ForecastDisplay implements Display, Observer {

    private float forecastTemperature = 0.0f;

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.forecastTemperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("\n=>forecast conditions");
        System.out.println("temperature: " + forecastTemperature + " °F");
        System.out.println("Note: Forecast NOT implemented yet");
    }

    // ? to register and unregister from outside constructor
    public void registerToGetUpdates() {
        this.weatherData.registerObserver(this);
    }

    public void unregisterToGetUpdates() {
        this.weatherData.removeObserver(this);
    }

}
