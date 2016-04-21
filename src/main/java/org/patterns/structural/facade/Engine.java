package org.patterns.structural.facade;

/**
 * @author Eugine Sokirka
 */
public class Engine {
    public void checkEngine() {
        try {
            System.out.println("Check engine!");
            System.out.print("Please wait .");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            System.out.println("OK");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void startEngine() {
        System.out.println("Start engine");
    }

    public void stopEngine() {
        System.out.println("Stop engine");
    }
}
