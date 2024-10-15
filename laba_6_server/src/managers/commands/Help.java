package managers.commands;

import managers.CollectionManager;
import managers.CommandManager;
import system.Request;

import java.util.Map;

/**
 * Реализация команды для вывода справки по доступным командам.
 */
public class Help implements Command {

    /**
     * @return название команды "help"
     */
    @Override
    public String getName() {
        return "help";
    }

    /**
     * @return описание команды "вывести справку по доступным командам"
     */
    @Override
    public String getDescription() {
        return "вывести справку по доступным командам";
    }

    /**
     * Выводит список всех доступных команд с их описаниями.
     * @param request аргументы команды (не используются)
     */
    @Override
    public String execute(Request request)  {
        StringBuilder line = new StringBuilder();
        Map<String, Command> commandList = CommandManager.getCommandList();
        commandList.forEach((name, command) -> line.append(command.getName()).append(" - ").append(command.getDescription()).append("\n"));
        return line.toString();
    }
}
