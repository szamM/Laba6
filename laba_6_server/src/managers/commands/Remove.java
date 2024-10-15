package managers.commands;

import data.Flat;
import managers.CollectionManager;
import system.Request;

import java.util.ArrayDeque;
import java.util.Objects;

/**
 * Реализация команды для удаления элемента коллекции по его id.
 */
public class Remove implements Command {

    /**
     * Выполняет команду для удаления элемента коллекции по его id.
     * @param request аргументы команды, где args[1] содержит id элемента для удаления
     */
    @Override
    public String execute(Request request) {
        return CollectionManager.removeCommand(request);
    }


    /**
     * @return название команды "remove_by_id"
     */
    @Override
    public String getName() {
        return "remove_by_id";
    }

    /**
     * @return описание команды "удалить элемент из коллекции по его id"
     */
    @Override
    public String getDescription() {
        return "удалить элемент из коллекции по его id";
    }
}

