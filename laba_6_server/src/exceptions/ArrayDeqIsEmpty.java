package exceptions;

/**
 * Исключение, возникающее, когда коллекция ArrayDeque пуста.
 */
public class ArrayDeqIsEmpty extends Exception {
    /**
     * Конструктор, создающий исключение с сообщением об ошибке.
     * @param args сообщение об ошибке
     */
    public ArrayDeqIsEmpty(String args) {
        super("Your collection is empty");
    }
}
