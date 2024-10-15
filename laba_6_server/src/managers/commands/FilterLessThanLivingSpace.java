package managers.commands;


import managers.CollectionManager;
import system.Request;

import java.io.IOException;

/**
 * Реализация команды для фильтрации элементов коллекции по полю livingSpace.
 */
public class FilterLessThanLivingSpace implements Command {

    /**
     * Выполняет команду для фильтрации элементов коллекции, значение поля livingSpace которых меньше заданного.
     * @param request аргументы команды, где arg[1] содержит значение поля livingSpace для фильтрации
     * @throws IOException если возникает ошибка ввода-вывода
     * @throws Exception если возникает любая другая ошибка
     */
    @Override
    public String execute(Request request) throws IOException, Exception {
        return CollectionManager.filterLessThanLivingSpace(request);
    }

    /**
     * @return название команды "FilterLessThanLivingSpace"
     */
    @Override
    public String getName() {
        return "filter_less_than_living_space";
    }

    /**
     * @return описание команды "вывести элементы, значение поля livingSpace которых меньше заданного"
     */
    @Override
    public String getDescription() {
        return "вывести элементы, значение поля livingSpace которых меньше заданного";
    }
}
