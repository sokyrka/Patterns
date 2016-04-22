package org.patterns.behavioral.templateMethod;

/**
 * @author Eugine Sokirka
 */
public class SecondConcreteClass extends AbstractClass {
    @Override
    void abstractOperation1() {
        System.out.println("Some concrete method realisation abstractOperation1 from SecondConcreteClass");
    }

    @Override
    void abstractOperation2() {
        System.out.println("Some concrete method realisation abstractOperation2 from SecondConcreteClass");
    }

    @Override
    public boolean hook() {
        return false;
    }
}
