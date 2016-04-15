package org.patterns.creational.factoryMethod.entity.bmw;

import org.patterns.creational.factoryMethod.entity.Car;

/**
 * @author Eugine Sokirka
 */
public class BMW750 extends Car {
    @Override
    public void getInfo() {
        System.out.println("It is BMW 750");
    }
}
