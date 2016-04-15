package org.patterns.creational.factoryMethod;


import org.patterns.creational.factoryMethod.entity.Car;
import org.patterns.creational.factoryMethod.factory.AudiFactory;
import org.patterns.creational.factoryMethod.factory.BMWFactory;
import org.patterns.creational.factoryMethod.factory.CarFactory;

/**
 * @author Eugine Sokirka
 */
public class FactoryMethodDescription {

    /**
     * Фабричный метод - определяет интерфейс создания объекта, но позволяет субклассам выбрать класс создаваемого экземпляра.
     * Фабрика делегирует создание объектов наследникам родительского класса.
     * Это позволяет использовать в коде программы не специфические классы, а манипулировать абстрактными объектами на более высоком уровне.
     */

    public static void main(String[] args) {
        String[] bmwArgs = {"bmw320", "bmw530", "bmw750"};
        String[] audiArgs = {"audiA3", "audiA5", "audiA7"};

        int bmwRandom = (int) (Math.random() * 3);
        int audiRandom = (int) (Math.random() * 3);

        getCarInfo(new BMWFactory(), bmwArgs[bmwRandom]);
        getCarInfo(new AudiFactory(), audiArgs[audiRandom]);
    }

    public static void getCarInfo(CarFactory carFactory, String arg) {
        Car car = carFactory.factoryMethod(arg);
        car.getInfo();
    }
}
