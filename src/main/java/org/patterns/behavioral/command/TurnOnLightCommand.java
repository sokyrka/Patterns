package org.patterns.behavioral.command;

/**
 * @author Eugine Sokirka
 * ConcreteCommand
 */
public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOn();
    }
}
