package managers.commands;

import data.Flat;
import exceptions.InvalidInputException;
import data.generators.FlatGenerator;
import data.generators.IdGenerator;
import managers.CollectionManager;
import system.Request;

import java.io.FileNotFoundException;

/**
 * Класс AddCommand реализует интерфейс Command и отвечает за добавление новой квартиры в коллекцию.
 */
public class Add implements Command {
    /**
     * Метод execute выполняет добавление новой квартиры в коллекцию.
     * @param request массив аргументов, не используется в этом методе.
     * @throws FileNotFoundException если возникает ошибка при чтении/записи файла.
     */
    @Override
    public String execute(Request request) throws FileNotFoundException, InvalidInputException {
        Flat flat = request.getFlat();
        CollectionManager.add(flat);
        return "Congrats!" + "\n"+ "Flat added!";
    }

    /**
     * Метод getName возвращает имя команды "add".
     * @return имя команды "add"
     */
    @Override
    public String getName() {
        return "add";
    }

    /**
     * Метод getDescription возвращает описание команды "Добавить новый элемент в коллекцию".
     * @return описание команды "Добавить новый элемент в коллекцию"
     */
    @Override
    public String getDescription() {
        return "Добавить новый элемент в коллекцию";
    }
}


