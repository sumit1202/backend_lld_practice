package design_patterns.behavorial_design_patterns.observer.subjects;

import design_patterns.behavorial_design_patterns.observer.observers.Observer;

//? subject/provider/publisher/observable/emitter
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
