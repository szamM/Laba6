package data;

import data.generators.IdGenerator;
import exceptions.ArrayDeqIsEmpty;
import exceptions.Validator;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Flat implements Comparable<Flat>, Serializable {
    @Serial
    private static final long serialVersionUID = 576057594404002L;
    private Long id; // Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; // Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; // Поле не может быть null
    private Date creationDate; // Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long area; // Поле не может быть null, Значение поля должно быть больше 0
    private int numberOfRooms; // Значение поля должно быть больше 0
    private Integer livingSpace; // Значение поля должно быть больше 0
    private Long numberOfBathrooms; // Поле не может быть null, Значение поля должно быть больше 0
    private View view; // Поле может быть null
    private House house; // Поле может быть null

    /**
     * Constructs a {@code Flat} object using the provided data array.
     * The array must contain valid data for all fields.
     *
     * @param data an array of strings containing the data for the flat
     * @throws ArrayDeqIsEmpty if any required field is empty or invalid
     */
    public Flat(String[] data) throws ArrayDeqIsEmpty {
        Validator.notNullint(data[1], "id");
        Validator.inputIsEmpty(data[2], "name");
        Validator.XIsRight(data[3], "x");
        Validator.notNullLong(data[4], "y");
        Validator.areaMoreThanZero(data[5], "area");
        Validator.numberOfRoomsMoreThanZero(data[6], "numberOfRooms");
        Validator.livingSpaceMoreThanZero(data[7], "livingSpace");
        Validator.notNullLong(data[8], "numberOfBathrooms");
        Validator.ViewIsRight(data[9]);
        Validator.inputIsEmpty(data[10], "name");
        Validator.intIsInt(data[11]);
        Validator.notNullLong(data[12], "numberOfFloors");
        Validator.notNullLong(data[13], "numberOfFlatsOnFloor");

        this.id = Long.parseLong(data[1]);
        this.name = data[2];
        this.coordinates = new Coordinates(Double.parseDouble(data[3]), Long.parseLong(data[4]));
        this.creationDate = new Date();
        this.area = Long.parseLong(data[5]);
        this.numberOfRooms = Integer.parseInt(data[6]);
        this.livingSpace = Integer.parseInt(data[7]);
        this.numberOfBathrooms = Long.parseLong(data[8]);
        this.view = View.valueOf(data[9]);
        this.house = new House(data[10], Integer.parseInt(data[11]), Long.parseLong(data[12]), Long.parseLong(data[13]));
    }

    /**
     * Constructs a {@code Flat} object with default values.
     * The ID is generated automatically.
     */
    public Flat() {
        this.id = IdGenerator.generateid();
        this.name = null;
        this.coordinates = null;
        this.creationDate = new Date();
        this.area = null;
        this.numberOfRooms = 0;
        this.livingSpace = 0;
        this.numberOfBathrooms = null;
        this.view = null;
        this.house = null;
    }

    /**
     * Constructs a {@code Flat} object with the specified ID.
     * Other fields are initialized to default values.
     *
     * @param id the ID of the flat
     */
    public Flat(Long id) {
        this.id = id;
        this.name = null;
        this.coordinates = null;
        this.creationDate = new Date();
        this.area = null;
        this.numberOfRooms = 0;
        this.livingSpace = null;
        this.numberOfBathrooms = null;
        this.view = null;
        this.house = null;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\tid='" + getId() + "'" +
                ",\n\tname='" + getName() + "'" +
                ",\n\tcoordinate_x='" + coordinates.getX() + "'" +
                ",\n\tcoordinate_y='" + coordinates.getY() + "'" +
                ",\n\tcreationDate='" + getCreationDate() + "'" +
                ",\n\tarea='" + getArea() + "'" +
                ",\n\tnumberOfRooms='" + getNumberOfRooms() + "'" +
                ",\n\tlivingSpace='" + getLivingSpace() + "'" +
                ",\n\tnumberOfBathrooms='" + getNumberOfBathrooms().toString() + "'" +
                ",\n\tView='" + getView().toString() + "'" +
                ",\n\tHouse='" + getHouse().toString() + "'" +
                "\n}}";
    }

    /**
     * Sets the name of the flat.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the flat.
     *
     * @return the name of the flat
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the ID of the flat.
     *
     * @param id the ID to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the ID of the flat.
     *
     * @return the ID of the flat
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the coordinates of the flat.
     *
     * @param coord the coordinates to set
     */
    public void setCoordinates(Coordinates coord) {
        this.coordinates = coord;
    }

    /**
     * Returns the coordinates of the flat.
     *
     * @return the coordinates of the flat
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the creation date of the flat.
     *
     * @param creationDate the creation date to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Returns the creation date of the flat.
     *
     * @return the creation date of the flat
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the area of the flat.
     *
     * @param area the area to set
     */
    public void setArea(Long area) {
        this.area = area;
    }

    /**
     * Returns the area of the flat.
     *
     * @return the area of the flat
     */
    public Long getArea() {
        return area;
    }

    /**
     * Sets the number of rooms in the flat.
     *
     * @param numberOfRooms the number of rooms to set
     */
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Returns the number of rooms in the flat.
     *
     * @return the number of rooms in the flat
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the living space of the flat.
     *
     * @param livingSpace the living space to set
     */
    public void setLivingSpace(int livingSpace) {
        this.livingSpace = livingSpace;
    }

    /**
     * Returns the living space of the flat.
     *
     * @return the living space of the flat
     */
    public Integer getLivingSpace() {
        return livingSpace;
    }

    /**
     * Sets the number of bathrooms in the flat.
     *
     * @param numberOfBathrooms the number of bathrooms to set
     */
    public void setNumberOfBathrooms(Long numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    /**
     * Returns the number of bathrooms in the flat.
     *
     * @return the number of bathrooms in the flat
     */
    public Long getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    /**
     * Sets the view from the flat.
     *
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }

    /**
     * Returns the view from the flat.
     *
     * @return the view from the flat
     */
    public View getView() {
        return view;
    }

    /**
     * Sets the house details of the flat.
     *
     * @param house the house details to set
     */
    public void setHouse(House house) {
        this.house = house;
    }

    /**
     * Returns the house details of the flat.
     *
     * @return the house details of the flat
     */
    public House getHouse() {
        return house;
    }

    @Override
    public int compareTo(Flat o) {
        if (this.view.equals(o.getView())) {
            return this.name.compareTo(o.getName());
        } else {
            return this.view.compareTo(o.getView());
        }
    }
}

