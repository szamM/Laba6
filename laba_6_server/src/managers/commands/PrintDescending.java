package managers.commands;

import data.Flat;
import managers.CollectionManager;
import system.Request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Реализация команды для вывода элементов коллекции в порядке убывания.
 */
public class PrintDescending implements Command {

    /**
     * Выводит элементы коллекции в порядке убывания по значению поля area.
     * @param request аргументы команды (не используются)
     * @throws IOException если возникает ошибка ввода-вывода
     * @throws Exception если возникает любая другая ошибка
     */
    @Override
    public String execute(Request request) throws IOException, Exception {
        List<Flat> flatList = new ArrayList<>(CollectionManager .getArrayDeque());
        Comparator<Flat> areaComparator = Comparator.comparing(Flat::getArea);
        flatList.sort(areaComparator.reversed());
        return flatList.toString();
    }

    /**
     * @return название команды "print_descending"
     */
    @Override
    public String getName() {
        return "print_descending";
    }

    /**
     * @return описание команды "вывести элементы коллекции в порядке убывания"
     */
    @Override
    public String getDescription() {
        return "вывести элементы коллекции в порядке убывания";
    }
}