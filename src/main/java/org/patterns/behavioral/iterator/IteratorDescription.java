package org.patterns.behavioral.iterator;

import java.util.Iterator;

/**
 * @author Eugine Sokirka
 */
public class IteratorDescription {

    /**
     * Итератор - предоставляет механизм последовательного перебора элементов коллекции без раскрытия ее врутреннего представления.
     */

    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;
        array[4] = 1;

        Iterator iterator = new ArrayIterator(array);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
