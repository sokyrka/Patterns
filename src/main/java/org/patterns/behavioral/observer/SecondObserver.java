package org.patterns.behavioral.observer;

/**
 * @author Eugine Sokirka
 */
public class SecondObserver implements Observer {
    private Subject subject;

    public SecondObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(Subject subject, Object arg) {
        if (subject instanceof SomeData) {
            System.out.println("Updated argument " + arg);
        }
    }
}
