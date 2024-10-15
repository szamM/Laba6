package managers.commands;

import managers.CollectionManager;
import system.Request;

/**
 * Реализация команды для сохранения коллекции в файл.
 */
public class Save implements Command {

    /**
     * Выполняет команду для сохранения коллекции в файл.
     * @param request аргументы команды (не используются)
     */
    @Override
    public String execute(Request request){
        // Путь к файлу для сохранения коллекции
        String filePath = System.getenv("FILE_PATH") + "/data.csv";

        // Сохраняем коллекцию в файл
        CollectionManager.saveCollection(filePath);

        // Выводим сообщение об успешном сохранении
        return "Коллекция сохранена в файл " + filePath;
    }

    /**
     * @return название команды "save"
     */
    @Override
    public String getName() {
        return "save";
    }

    /**
     * @return описание команды "сохранить коллекцию в файл"
     */
    @Override
    public String getDescription() {
        return "сохранить коллекцию в файл";
    }
}
