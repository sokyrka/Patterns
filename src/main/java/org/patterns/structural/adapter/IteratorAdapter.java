package org.patterns.structural.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Eugine Sokirka
 */
public class IteratorAdapter implements Enumeration {
    private Iterator iterator;

    public IteratorAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
