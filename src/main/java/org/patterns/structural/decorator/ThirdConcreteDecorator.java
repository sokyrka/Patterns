package org.patterns.structural.decorator;

/**
 * @author Eugine Sokirka
 */
public class ThirdConcreteDecorator extends Decorator {
    public ThirdConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }
}
