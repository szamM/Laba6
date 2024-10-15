package managers.commands;

import exceptions.UnknownCommandException;
import system.Request;

/**
 * Интерфейс Command определяет методы для выполнения команды, получения имени команды и ее описания.
 */
public interface Command {
    /**
     * Метод execute выполняет действие, связанное с данной командой.
     * @param request массив аргументов, необходимых для выполнения команды.
     * @throws Exception если при выполнении команды произошла ошибка.
     */
    String execute(Request request) throws Exception, UnknownCommandException;

    /**
     * Метод getName возвращает имя команды.
     * @return имя команды.
     */
    String getName();

    /**
     * Метод getDescription возвращает описание команды.
     * @return описание команды.
     */
    String getDescription();
}