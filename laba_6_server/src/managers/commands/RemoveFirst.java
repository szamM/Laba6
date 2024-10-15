package managers.commands;

import exceptions.ArrayDeqIsEmpty;
import managers.CollectionManager;
import system.Request;

/**
 * Реализация команды для удаления первого элемента коллекции.
 */
public class RemoveFirst implements Command {

    /**
     * Выполняет команду для удаления первого элемента коллекции.
     * @param request аргументы команды (не используются)
     * @throws ArrayDeqIsEmpty если коллекция пуста
     */
    @Override
    public String execute(Request request) throws ArrayDeqIsEmpty {
        if (CollectionManager.getArrayDeque().size() == 0){
            throw new ArrayDeqIsEmpty("Коллекция пуста");
        }
        else{
            CollectionManager.getArrayDeque().removeFirst();
            return "Элемент удален";
        }
    }

    /**
     * @return название команды "Remove first"
     */
    @Override
    public String getName() {
        return "Remove first";
    }

    /**
     * @return описание команды "удалить первый элемент из коллекции"
     */
    @Override
    public String getDescription() {
        return "удалить первый элемент из коллекции";
    }
}

