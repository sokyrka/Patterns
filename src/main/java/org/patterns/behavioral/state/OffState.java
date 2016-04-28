package org.patterns.behavioral.state;

/**
 * @author Eugine Sokirka
 */
public class OffState implements State {
    private Context context;

    public OffState(Context context) {
        this.context = context;
    }

    public void on() {
        System.out.println("Off state in process...");
        context.setCurrentState(context.getOnState());
    }

    public void off() {
        System.out.println("Impossible to do this operation");
    }

    @Override
    public String toString() {
        return "Off State";
    }
}
