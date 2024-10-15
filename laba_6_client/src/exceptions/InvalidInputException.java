package exceptions;

/**
 * Исключение, возникающее при неправильном входном аргументе.
 */
public class InvalidInputException extends Exception {
    /**
     * Конструктор, создающий исключение с сообщением об ошибке.
     * @param data входной аргумент, который вызвал ошибку
     */
    public InvalidInputException(String data) {
        super("Wrong input argument: " + data);
    }
}
