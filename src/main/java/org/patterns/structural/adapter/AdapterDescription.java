package org.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 * @author Eugine Sokirka
 */
public class AdapterDescription {

    /**
     * Адаптер - преобразует интерфейс класса к другому интерфейсу, на который рассчитан клиент. Адаптер обеспечивает
     * совместную работу классов, невозможную в обычных условиях из-за несовместимости интерфейсов.
     * Существует две разновидности: адаптер объектов и адаптер классов.
     */

    public static void main(String[] args) {
        Enumeration enumeration = new IteratorAdapter(new ArrayList<String>().iterator());
        System.out.println(enumeration.hasMoreElements());
    }
}
