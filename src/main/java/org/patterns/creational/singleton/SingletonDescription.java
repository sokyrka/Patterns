package org.patterns.creational.singleton;

/**
 * @author Eugine Sokirka
 */
public class SingletonDescription {

    /**
     * Одиночка - гарантирует, что класс имеет только один экземпляр и
     * предоставляет глобальную точку доступа к этому экземпляру.
     */

    public static void main(String[] args) {
        new Thread(new Test()).start();
        new Thread(new Test()).start();
    }

    static class Test implements Runnable{
        public void run() {
            System.out.println(SingletonThreadSafe.getInstance());
        }
    }
}
