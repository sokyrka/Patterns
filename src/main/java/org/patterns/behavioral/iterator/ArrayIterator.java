package org.patterns.behavioral.iterator;

import java.util.Iterator;

/**
 * @author Eugine Sokirka
 */
public class ArrayIterator<T> implements Iterator {
    private T[] array;
    private int position;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.position = 0;
    }

    public boolean hasNext() {
        return (!(position >= array.length || array[position] == null));
    }

    public Object next() {
        T item = array[position];
        position++;
        return item;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
