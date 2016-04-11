package org.patterns.behavioral.strategy.entity;

import org.patterns.behavioral.strategy.behavior.EngineBehavior;

/**
 * @author Eugine Sokirka
 */
public class Sedan extends Car{

    public Sedan(EngineBehavior engineBehavior) {
        super(engineBehavior);
    }

    @Override
    void stop() {
        //Some realisation
    }
}
