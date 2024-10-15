package system;

import data.Flat;

import java.io.Serial;
import java.io.Serializable;

public class Request implements Serializable {

    @Serial
    private static final long serialVersionUID = 5760575944040770153L;
    private String message = null;
    private String arg = null;
    private Flat flat = null;

    /**
     *  Конструктор для создания запроса
     * @param message сообщение
     * @param flat    объект
     */
    public Request(String message,String arg, Flat flat) {
        this.message = message;
        this.arg = arg;
        this.flat = flat;
    }

    /**
     *  Метод для создания запроса
     * @param message сообщение
     */
    public Request(String message) {
        this.message = message;
    }

    /**
     *  Метод для получения сообщения
     * @return Сообщение
     */

    public String getArg() {
        return arg;
    }
    public void setArg(String arg) {
        this.arg = arg;
    }
    public String getMessage() {
        return message;
    }

    /**
     *  Метод для установки сообщения
     * @param message   сообщение
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public Flat getFlat() {
        return flat;
    }
    public void setFlat(Flat flat) {
        this.flat = flat;
    }

}

