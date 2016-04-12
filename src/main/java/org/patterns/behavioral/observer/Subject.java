package org.patterns.behavioral.observer;

/**
 * @author Eugine Sokirka
 * Observable
 */
public interface Subject {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyChange();
}
