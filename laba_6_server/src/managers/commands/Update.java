package managers.commands;


import managers.CollectionManager;
import system.Request;


/**
 * Реализация команды для обновления элемента коллекции по его id.
 */
public class Update implements Command {

    /**
     * Выполняет команду для обновления элемента коллекции по его id.
     * @param request аргументы команды, где args[1] содержит id элемента для обновления
     * @throws Exception если возникает любая ошибка
     */
    @Override
    public String execute(Request request) throws Exception {
        return CollectionManager.updateCommand(request);
    }

    /**
     * @return название команды "update"
     */
    @Override
    public String getName() {
        return "update";
    }

    /**
     * @return описание команды "обновить значение элемента коллекции, id которого равен заданному"
     */
    @Override
    public String getDescription() {
        return "обновить значение элемента коллекции, id которого равен заданному";
    }
}
