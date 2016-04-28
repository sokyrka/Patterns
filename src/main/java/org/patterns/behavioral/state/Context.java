package org.patterns.behavioral.state;

/**
 * @author Eugine Sokirka
 */
public class Context {
    private State onState;
    private State offState;
    private State currentState;

    public Context() {
        onState = new OnState(this);
        offState = new OffState(this);
        currentState = offState;
    }

    public void on() {
        currentState.on();
    }

    public void off() {
        currentState.off();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getOffState() {
        return offState;
    }

    public State getOnState() {
        return onState;
    }

    @Override
    public String toString() {
        return currentState.toString();
    }
}
