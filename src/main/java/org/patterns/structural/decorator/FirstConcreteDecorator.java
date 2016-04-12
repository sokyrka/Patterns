package org.patterns.structural.decorator;

/**
 * @author Eugine Sokirka
 */
public class FirstConcreteDecorator extends Decorator {
    public FirstConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }
}
