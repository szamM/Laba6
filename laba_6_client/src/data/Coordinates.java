package data;

import java.io.Serial;
import java.io.Serializable;

/**
 * Модель объекта "координаты".
 * Содержит геттеры и сеттеры.
 */
public class Coordinates implements Serializable {
    @Serial
    private static final long serialVersionUID = 576057594404001L;
    private double x; // Значение поля должно быть больше -417
    private long y;

    /**
     * Конструктор для создания объекта Coordinates.
     * @param x координата по оси X
     * @param y координата по оси Y
     */
    public Coordinates(Double x, long y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return значение координаты X
     */
    public double getX() {
        return x;
    }

    /**
     * @return значение координаты Y
     */
    public long getY() {
        return y;
    }

    /**
     * Устанавливает новое значение координаты X.
     * @param x новое значение координаты X
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Устанавливает новое значение координаты Y.
     * @param y новое значение координаты Y
     */
    public void setY(long y) {
        this.y = y;
    }
}
