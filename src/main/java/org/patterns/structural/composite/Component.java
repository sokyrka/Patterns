package org.patterns.structural.composite;

/**
 * @author Eugine Sokirka
 */
public abstract class Component {

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
