package org.patterns.structural.decorator;

/**
 * @author Eugine Sokirka
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void doOperation() {
        component.doOperation();
    }
}
