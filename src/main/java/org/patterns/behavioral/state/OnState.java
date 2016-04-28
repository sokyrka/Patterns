package org.patterns.behavioral.state;

/**
 * @author Eugine Sokirka
 */
public class OnState implements State {
    private Context context;

    public OnState(Context context) {
        this.context = context;
    }

    public void on() {
        System.out.println("Impossible to do this operation");
    }

    public void off() {
        System.out.println("On state in process...");
        context.setCurrentState(context.getOffState());
    }

    @Override
    public String toString() {
        return "On State";
    }
}
