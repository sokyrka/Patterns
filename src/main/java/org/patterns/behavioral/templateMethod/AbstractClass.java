package org.patterns.behavioral.templateMethod;

/**
 * @author Eugine Sokirka
 */
public abstract class AbstractClass {
    public final void factoryMethod() {
        abstractOperation1();
        concreteOperation();
        if (hook())/**Перехватчик*/
            abstractOperation2();
    }

    abstract void abstractOperation1();

    abstract void abstractOperation2();

    public final void concreteOperation() {
        System.out.println("Concrete operation");
    }

    public boolean hook() {
        return true; /**Перехватчик*/
    }
}
