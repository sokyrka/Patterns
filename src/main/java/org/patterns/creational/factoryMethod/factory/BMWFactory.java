package org.patterns.creational.factoryMethod.factory;

import org.patterns.creational.factoryMethod.entity.Car;
import org.patterns.creational.factoryMethod.entity.bmw.BMW320;
import org.patterns.creational.factoryMethod.entity.bmw.BMW530;
import org.patterns.creational.factoryMethod.entity.bmw.BMW750;

/**
 * @author Eugine Sokirka
 */
public class BMWFactory implements CarFactory {
    public Car factoryMethod(String arg) {
        if ("bmw320".equalsIgnoreCase(arg)) {
            return new BMW320();
        } else if ("bmw530".equalsIgnoreCase(arg)) {
            return new BMW530();
        } else if ("bmw750".equalsIgnoreCase(arg)) {
            return new BMW750();
        } else {
            return null;
        }
    }
}
