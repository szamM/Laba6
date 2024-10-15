package data;

import java.io.Serial;
import java.io.Serializable;

/**
 * The {@code House} class represents a house with various attributes such as name, year of construction,
 * number of floors, and number of flats on each floor. It includes validation for input data.
 */
public class House implements Serializable {
    @Serial
    private static final long serialVersionUID = 576057594404005L;
    private String name; // Поле может быть null
    private Integer year; // Значение поля должно быть больше 0
    private Long numberOfFloors; // Значение поля должно быть больше 0
    private long numberOfFlatsOnFloor; // Значение поля должно быть больше 0

    /**
     * Constructs a {@code House} object with the specified name, year, number of floors, and number of flats on each floor.
     *
     * @param name the name of the house
     * @param year the year the house was constructed
     * @param numberOfFloors the number of floors in the house
     * @param numberOfFlatsOnFloor the number of flats on each floor
     */
    public House(String name, Integer year, Long numberOfFloors, long numberOfFlatsOnFloor) {
        this.name = name;
        this.year = year;
        this.numberOfFloors = numberOfFloors;
        this.numberOfFlatsOnFloor = numberOfFlatsOnFloor;
    }

    /**
     * Constructs a {@code House} object with default values.
     */
    public House() {
        this.name = null;
        this.year = 0;
        this.numberOfFloors = null;
        this.numberOfFlatsOnFloor = 0;
    }

    /**
     * Returns a string representation of the house.
     *
     * @return a string representation of the house
     */
    @Override
    public String toString() {
        return "{" +
                "\n\tname='" + getName() + "'" +
                ",\n\tyear='" + getYear().toString() + "'" +
                ",\n\tNumberOfFloors='" + getNumberOfFloors().toString() + "'" +
                ",\n\tNumberOfFlatsOnFloor='" + getNumberOfFlatsOnFloor().toString() + "'" +
                "\n}}";
    }

    /**
     * Returns the name of the house.
     *
     * @return the name of the house
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the house.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the year the house was constructed.
     *
     * @return the year the house was constructed
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the year the house was constructed.
     *
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Returns the number of floors in the house.
     *
     * @return the number of floors in the house
     */
    public Long getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Sets the number of floors in the house.
     *
     * @param numberOfFloors the number of floors to set
     */
    public void setNumberOfFloors(Long numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    /**
     * Returns the number of flats on each floor.
     *
     * @return the number of flats on each floor
     */
    public Long getNumberOfFlatsOnFloor() {
        return numberOfFlatsOnFloor;
    }

    /**
     * Sets the number of flats on each floor.
     *
     * @param numberOfFlatsOnFloor the number of flats on each floor to set
     */
    public void setNumberOfFlatsOnFloor(long numberOfFlatsOnFloor) {
        this.numberOfFlatsOnFloor = numberOfFlatsOnFloor;
    }
}
