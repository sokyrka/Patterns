package org.patterns.behavioral.templateMethod;

/**
 * @author Eugine Sokirka
 */
public class FirstConcreteClass extends AbstractClass {
    @Override
    void abstractOperation1() {
        System.out.println("Some concrete method realisation abstractOperation1 from FirstConcreteClass");
    }

    @Override
    void abstractOperation2() {
        System.out.println("Some concrete method realisation abstractOperation2 from FirstConcreteClass");
    }
}
