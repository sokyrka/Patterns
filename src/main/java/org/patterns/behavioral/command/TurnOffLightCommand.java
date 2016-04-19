package org.patterns.behavioral.command;

/**
 * @author Eugine Sokirka
 * ConcreteCommand
 */
public class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOff();
    }
}
