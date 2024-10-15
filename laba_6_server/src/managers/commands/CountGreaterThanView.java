package managers.commands;

import data.Flat;
import data.View;
import exceptions.ArrayDeqIsEmpty;
import managers.CollectionManager;
import system.Request;

import java.io.IOException;

/**
 * Класс CountGreaterThanView реализует интерфейс Command и отвечает за подсчет количества элементов в коллекции, у которых значение поля View больше заданного.
 */
public class CountGreaterThanView implements Command {
    /**
     * Метод execute выполняет подсчет количества элементов в коллекции, у которых значение поля View больше заданного.
     * @param request массив аргументов, содержащий значение поля View, с которым нужно сравнивать.
     * @throws IOException если возникает ошибка ввода-вывода.
     * @throws Exception если возникает любая другая ошибка.
     */
    @Override
    public String execute(Request request) throws IOException, Exception {
        return CollectionManager.countGreaterThanView(request);
    }

    /**
     * Метод getName возвращает имя команды "count greater than view".
     * @return имя команды "count greater than view"
     */
    @Override
    public String getName() {
        return "count_greater_than_view";
    }

    /**
     * Метод getDescription возвращает описание команды "вывести количество элементов, значение поля view которых больше заданного".
     * @return описание команды "вывести количество элементов, значение поля view которых больше заданного"
     */
    @Override
    public String getDescription() {
        return "вывести количество элементов, значение поля view которых больше заданного";
    }
}
