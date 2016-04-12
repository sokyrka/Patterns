package org.patterns.structural.decorator;

/**
 * @author Eugine Sokirka
 */
public class ConcreteComponent implements Component {
    public void doOperation() {
        System.out.print("World!");
    }
}
