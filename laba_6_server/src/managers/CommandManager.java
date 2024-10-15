package managers;

import exceptions.UnknownCommandException;
import managers.commands.*;
import system.Request;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Менеджер для управления командами, поддерживаемыми в приложении.
 */
public class CommandManager {
    private static Map<String, Command> commandList;

    /**
     * Конструктор, инициализирующий список доступных команд.
     */
    public CommandManager() {
        commandList = new HashMap<>();
        commandList.put("help", new Help());
        commandList.put("info", new Info());
        commandList.put("show", new Show());
        commandList.put("add", new Add());
        commandList.put("update", new Update());
        commandList.put("remove_by_id", new Remove());
        commandList.put("clear", new Clear());
        commandList.put("save", new Save());
        commandList.put("execute_script", new ExecuteScript());
        commandList.put("remove_first", new RemoveFirst());
        commandList.put("head", new Head());
        commandList.put("remove_head", new RemoveHead());
        commandList.put("count_greater_than_view", new CountGreaterThanView());
        commandList.put("filter_less_than_living_space", new FilterLessThanLivingSpace());
        commandList.put("print_descending", new PrintDescending());
    }

    /**
     * Выполняет команду, переданную в виде строки.
     * @param request объект запроса
     * @throws UnknownCommandException если команда не найдена в списке доступных
     * @throws IOException если возникает ошибка ввода-вывода
     * @throws Exception если возникает любая другая ошибка
     */
    public static String startExecuting(Request request) throws Exception, UnknownCommandException {
        String[] elements = request.getMessage().split(" ");
        String commandName = elements[0];
        if (!commandList.containsKey(commandName)) {
            return "неизвестная команда";
        }
        Command command = commandList.get(commandName);
        return command.execute(request);
    }


    /**
     * @return список доступных команд
     */
    public static Map getCommandList() {
        return commandList;
    }
}
