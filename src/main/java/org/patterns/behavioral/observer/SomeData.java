package org.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eugine Sokirka
 */
public class SomeData implements Subject {
    private List<Observer> observers;

    public SomeData() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange() {
        for (Observer observer : observers) {
            observer.update(this, null);
        }
    }
}
