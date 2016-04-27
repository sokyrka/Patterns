package org.patterns.structural.composite;

/**
 * @author Eugine Sokirka
 */
public class CompositeDescription {

    /**
     * Компоновщик - объединяет объекты в древовидные структуры для представления иерархий. Компоновщик позволяет
     * клиенту выполнять однородные операции с отдельными объектами и их совокупностями. Паттерн Компоновщик позволяет
     * создавать древовидные структуры, узлами которых являются как комбинации, так и отдельные объекты.
     */

    public static void main(String[] args) {
        Component mainComponent = new CompositeComponent("Main", "Main component");
        Component innerComponent = new CompositeComponent("Inner", "Inner component");

        Component firstLeaf = new Leaf("First leaf", "Leaf");
        Component secondLeaf = new Leaf("Second leaf", "Leaf");
        Component thirdLeaf = new Leaf("Third leaf", "Leaf");

        Component firstInnerLeaf = new Leaf("First inner leaf", "Leaf");
        Component secondInnerLeaf = new Leaf("Second inner leaf", "Leaf");
        Component thirdInnerLeaf = new Leaf("Third inner leaf", "Leaf");

        innerComponent.addComponent(firstInnerLeaf);
        innerComponent.addComponent(secondInnerLeaf);
        innerComponent.addComponent(thirdInnerLeaf);
        mainComponent.addComponent(innerComponent);

        mainComponent.addComponent(firstLeaf);
        mainComponent.addComponent(secondLeaf);
        mainComponent.addComponent(thirdLeaf);

        mainComponent.print();
    }
}
