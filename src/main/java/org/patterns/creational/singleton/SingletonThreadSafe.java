package org.patterns.creational.singleton;

/**
 * @author Eugine Sokirka
 */
public class SingletonThreadSafe {
    private volatile static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public synchronized static SingletonThreadSafe getInstance() {
        synchronized (SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }
}
