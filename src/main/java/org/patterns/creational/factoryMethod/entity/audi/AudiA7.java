package org.patterns.creational.factoryMethod.entity.audi;

import org.patterns.creational.factoryMethod.entity.Car;

/**
 * @author Eugine Sokirka
 */
public class AudiA7 extends Car {
    @Override
    public void getInfo() {
        System.out.println("It is Audi A7");
    }
}
