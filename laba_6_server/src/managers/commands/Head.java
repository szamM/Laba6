package managers.commands;

import exceptions.ArrayDeqIsEmpty;
import managers.CollectionManager;
import system.Request;

/**
 * Реализация команды для получения первого элемента коллекции.
 */
public class Head implements Command {

    /**
     * Выполняет команду для получения первого элемента коллекции.
     * @param request аргументы команды (не используются)
     * @throws ArrayDeqIsEmpty если коллекция пуста
     */
    @Override
    public String execute(Request request) throws ArrayDeqIsEmpty {
        if (CollectionManager.getArrayDeque().size() == 0){
            throw new ArrayDeqIsEmpty("Коллекция пуста");
        }
        else{
            return CollectionManager.getArrayDeque().getFirst().toString();
        }
    }

    /**
     * @return название команды "head"
     */
    @Override
    public String getName() {
        return "head";
    }

    /**
     * @return описание команды "Get first element of collection"
     */
    @Override
    public String getDescription() {
        return "Get first element of collection";
    }

}
