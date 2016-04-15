package org.patterns.creational.factoryMethod.entity;

/**
 * @author Eugine Sokirka
 */
public abstract class Car {
    private String brand;
    private String model;

    public abstract void getInfo();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
