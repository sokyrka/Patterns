package org.patterns.behavioral.command;

/**
 * @author Eugine Sokirka
 */
public class CommandDescription {

    /**
     * Команда - инкапсулирует запрос в виде объекта, делая возможной параметризацию клиентских объектов
     * с другими запросами, организацию очереди или регистрацию запросов, а также поддержку отмены операций.
     */

    public static void main(String[] args) {
        Light light = new Light(); /**Receiver*/
        Command onCommand = new TurnOnLightCommand(light); /**ConcreteCommand*/
        Command offCommand = new TurnOffLightCommand(light); /**ConcreteCommand*/

        CommandManager manager = new CommandManager(); /**Invoker*/
        manager.addCommand(onCommand);
        manager.addCommand(offCommand);

        manager.run();
    }
}
