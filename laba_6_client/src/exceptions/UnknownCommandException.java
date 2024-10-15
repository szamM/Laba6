package exceptions;

/**
 * Исключение, возникающее при вызове неизвестной команды.
 */
public class UnknownCommandException extends Throwable {
    /**
     * Конструктор, создающий исключение с сообщением об ошибке.
     * @param commandName название неизвестной команды, которая вызвала ошибку
     */
    public UnknownCommandException(String commandName) {
        super("Unknown command " + commandName);
    }
}

