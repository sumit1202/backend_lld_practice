package design_patterns.behavorial_design_patterns.observer.displays;

import design_patterns.behavorial_design_patterns.observer.observers.Observer;
import design_patterns.behavorial_design_patterns.observer.subjects.Subject;
import design_patterns.behavorial_design_patterns.observer.subjects.WeatherData;

public class CurrentConditionsDisplay implements Display, Observer {

    private float temperature;
    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("\n=>current conditions");
        System.out.println("temperature: " + temperature + " °F");
        System.out.println("humidity: " + humidity + " %");
    }

    // ? to register and unregister from outside constructor
    public void registerToGetUpdates() {
        this.weatherData.registerObserver(this);
    }

    public void unregisterToGetUpdates() {
        this.weatherData.removeObserver(this);
    }

}
