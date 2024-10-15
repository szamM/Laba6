package managers.commands;

import managers.CollectionManager;
import system.Request;

/**
 * Класс ClearCommand реализует интерфейс Command и отвечает за очистку коллекции.
 */
public class Clear implements Command {
    /**
     * Метод execute выполняет очистку коллекции.
     * @param request массив аргументов, не используется в этом методе.
     * @throws Exception если возникает ошибка при очистке коллекции.
     */
    @Override
    public String execute(Request request) throws Exception {
        CollectionManager.clear();
        return "Collection successfully cleared!";
    }

    /**
     * Метод getName возвращает имя команды "clear".
     * @return имя команды "clear"
     */
    @Override
    public String getName() {
        return "clear";
    }

    /**
     * Метод getDescription возвращает описание команды "очистить коллекцию".
     * @return описание команды "очистить коллекцию"
     */
    @Override
    public String getDescription() {
        return "очистить коллекцию";
    }
}
