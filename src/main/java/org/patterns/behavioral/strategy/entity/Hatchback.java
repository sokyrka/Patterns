package org.patterns.behavioral.strategy.entity;

import org.patterns.behavioral.strategy.behavior.EngineBehavior;

/**
 * @author Eugine Sokirka
 */
public class Hatchback extends Car {

    public Hatchback(EngineBehavior engineBehavior) {
        super(engineBehavior);
    }

    @Override
    void stop() {
        //Some realisation
    }
}
