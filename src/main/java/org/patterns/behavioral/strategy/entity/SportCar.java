package org.patterns.behavioral.strategy.entity;

import org.patterns.behavioral.strategy.behavior.EngineBehavior;

/**
 * @author Eugine Sokirka
 */
public class SportCar extends Car {

    public SportCar(EngineBehavior engineBehavior) {
        super(engineBehavior);
    }

    @Override
    void stop() {
        //Some realisation
    }
}
