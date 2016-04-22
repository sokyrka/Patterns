package org.patterns.behavioral.templateMethod;

/**
 * @author Eugine Sokirka
 */
public class TemplateMethodDescription {

    /**
     * Шаблонный метод - задает скелет алгоритма в методе, оставляя определение реализации некоторых шагов субклассам.
     * Субкласы могут переопределять некоторые части алгоритма без изменения его структуры.
     * Опеределяет основные шаги алгоритма и позволяет субклассам предоставить реализацию одного или нескольких шагов.
     */

    public static void main(String[] args) {
        FirstConcreteClass firstConcreteClass = new FirstConcreteClass();
        firstConcreteClass.factoryMethod();

        SecondConcreteClass secondConcreteClass = new SecondConcreteClass();
        secondConcreteClass.factoryMethod();
    }
}
