package org.patterns.creational.factoryMethod.factory;

import org.patterns.creational.factoryMethod.entity.Car;

/**
 * @author Eugine Sokirka
 */
public interface CarFactory {
    Car factoryMethod(String arg);
}
