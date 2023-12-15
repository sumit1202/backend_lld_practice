package design_patterns.behavorial_design_patterns.observer.subjects;

import java.util.ArrayList;
import java.util.List;

import design_patterns.behavorial_design_patterns.observer.observers.Observer;

public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("\n=>observer registered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("\n=>observer unregistered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            System.out.println("\n=>observer notified: " + observer.getClass().getSimpleName());
            observer.update(temperature, pressure, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
