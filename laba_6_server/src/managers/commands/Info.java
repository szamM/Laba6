package managers.commands;

import managers.CollectionManager;
import system.Request;

/**
 * Реализация команды для вывода информации о коллекции.
 */
public class Info implements Command {

    /**
     * Выводит информацию о коллекции, включая ее тип, дату инициализации и количество элементов.
     * @param request аргументы команды (не используются)
     * @throws Exception если возникает любая ошибка
     */
    @Override
    public String execute(Request request) throws Exception {
        return CollectionManager.getInfo();
    }

    /**
     * @return название команды "info"
     */
    @Override
    public String getName() {
        return "info";
    }

    /**
     * @return описание команды "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)"
     */
    @Override
    public String getDescription() {
        return "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }
}
