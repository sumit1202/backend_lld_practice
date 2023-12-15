package design_patterns.behavorial_design_patterns.observer.displays;

import design_patterns.behavorial_design_patterns.observer.observers.Observer;
import design_patterns.behavorial_design_patterns.observer.subjects.Subject;

public class StatsDisplay implements Display, Observer {

    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;
    private int numReadings;

    private Subject weatherData;

    public StatsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("\n=>Statistics:");
        System.out.println("minimum temperature: " + minTemp + " °F");
        System.out.println("maximum temperature: " + maxTemp + " °F");
        System.out.println("average temperature: " + (tempSum / numReadings) + " °F");

    }

    // ? to register and unregister from outside constructor
    public void registerToGetUpdates() {
        this.weatherData.registerObserver(this);
    }

    public void unregisterToGetUpdates() {
        this.weatherData.removeObserver(this);
    }

}
