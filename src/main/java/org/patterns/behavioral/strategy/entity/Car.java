package org.patterns.behavioral.strategy.entity;

import org.patterns.behavioral.strategy.behavior.EngineBehavior;

/**
 * @author Eugine Sokirka
 */
public abstract class Car {
    private EngineBehavior engineBehavior;/**Композиция: Класс Car содержит EngineBehavior*/

    public Car(EngineBehavior engineBehavior) {
        this.engineBehavior = engineBehavior;
    }

    abstract void stop();

    public void turnLeft() {
        //Method realisation
    }

    public void turnRight() {
        //Method realisation
    }

    public void delegateStart() {
        engineBehavior.start();
    }
}
