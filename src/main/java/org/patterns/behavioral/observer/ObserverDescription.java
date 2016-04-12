package org.patterns.behavioral.observer;

/**
 * @author Eugine Sokirka
 */
public class ObserverDescription {

    /**
     * Наблюдатель - определяет отношение "один-ко-многим" между объектами таким образом, что при изменении состояния
     * одного объекта происходит автоматическое оповещение и обновление всех зависимых объектов.
     */

    public static void main(String[] args) {
        SomeData someData = new SomeData();/**Observable*/

        FirstObserver firstObserver = new FirstObserver(someData);/**Observer*/
        SecondObserver secondObserver = new SecondObserver(someData);/**Observer*/

        someData.notifyChange();
    }
}
