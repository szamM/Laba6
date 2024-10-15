package managers.commands;


import managers.CollectionManager;
import system.Request;

/**
 * Реализация команды для вывода всех элементов коллекции.
 */
public class Show implements Command {

    /**
     * Выводит все элементы коллекции в строковом представлении.
     * @param request аргументы команды (не используются)
     * @throws Exception если возникает любая ошибка
     */
    @Override
    public String execute(Request request) throws Exception {
        return CollectionManager.showCommand(request);
    }

    /**
     * @return название команды "show"
     */
    @Override
    public String getName() {
        return "show";
    }

    /**
     * @return описание команды "вывести в стандартный поток вывода все элементы коллекции в строковом представлении"
     */
    @Override
    public String getDescription() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}

