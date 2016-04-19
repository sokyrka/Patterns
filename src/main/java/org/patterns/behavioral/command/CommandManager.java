package org.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eugine Sokirka
 * Invoker
 */
public class CommandManager {
    private List<Command> commandQueue = new ArrayList<Command>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void run() {
        for (Command command : commandQueue) {
            command.execute();
        }
    }
}
