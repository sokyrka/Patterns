package org.patterns.creational.factoryMethod.factory;

import org.patterns.creational.factoryMethod.entity.Car;
import org.patterns.creational.factoryMethod.entity.audi.AudiA3;
import org.patterns.creational.factoryMethod.entity.audi.AudiA5;
import org.patterns.creational.factoryMethod.entity.audi.AudiA7;

/**
 * @author Eugine Sokirka
 */
public class AudiFactory implements CarFactory {
    public Car factoryMethod(String arg) {
        if ("audia3".equalsIgnoreCase(arg)) {
            return new AudiA3();
        } else if ("audia5".equalsIgnoreCase(arg)) {
            return new AudiA5();
        } else if ("audia7".equalsIgnoreCase(arg)) {
            return new AudiA7();
        } else {
            return null;
        }
    }
}
