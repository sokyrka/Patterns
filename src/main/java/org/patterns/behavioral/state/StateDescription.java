package org.patterns.behavioral.state;

/**
 * @author Eugine Sokirka
 */
public class StateDescription {

    /**
     * Состояние - управляет изменением поведения объекта при изменении его внутреннего состояния.
     * Внешне это выглядит так, словно объект меняет свой класс.
     */

    public static void main(String[] args) {
        Context context = new Context();

        System.out.println(context);

        context.on();

        System.out.println(context);

        context.off();

        System.out.println(context);
    }
}
