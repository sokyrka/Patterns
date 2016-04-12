package org.patterns.structural.decorator;

/**
 * @author Eugine Sokirka
 */
public class DecoratorDescription {

    /**
     * Декоратор - динамически наделяет объект новыми возможностями и является гибкой альтернативой наследованию.
     */

    public static void main(String[] args) {
        Component component = new FirstConcreteDecorator(new SecondConcreteDecorator(new ThirdConcreteDecorator(new ConcreteComponent())));
        component.doOperation();
    }
}
