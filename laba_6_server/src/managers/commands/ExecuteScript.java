package managers.commands;

import managers.CollectionManager;
import exceptions.UnknownCommandException;
import system.Request;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс ExecuteScriptCommand реализует интерфейс Command и отвечает за выполнение скрипта из файла.
 */
public class ExecuteScript implements Command {
    /**
     * Множество для хранения уникальных имен скриптов, чтобы избежать зацикливания.
     */
    public static Set<String> scripts = new HashSet<>();

    /**
     * Метод execute выполняет чтение и исполнение команд из указанного файла.
     * @param request массив аргументов, содержащий путь к файлу со скриптом.
     * @throws FileNotFoundException если файл со скриптом не найден.
     */
    @Override
    public String execute(Request request) throws Exception, UnknownCommandException {
        return CollectionManager.executeScript(request);
    }

    /**
     * Метод getName возвращает имя команды "execute_script file_name".
     * @return имя команды "execute_script file_name"
     */
    @Override
    public String getName() {
        return "execute_script file_name";
    }

    /**
     * Метод getDescription возвращает описание команды "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.".
     * @return описание команды "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме."
     */
    @Override
    public String getDescription() {
        return "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }
}

