package org.patterns.structural.decorator;

/**
 * @author Eugine Sokirka
 */
public class SecondConcreteDecorator extends Decorator {
    public SecondConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }
}
