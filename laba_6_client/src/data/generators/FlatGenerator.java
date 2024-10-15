package data.generators;

import data.Coordinates;
import data.Flat;
import data.House;
import data.View;
import exceptions.Validator;

import java.io.Serial;
import java.io.Serializable;
import java.util.Scanner;

/**
 * The {@code FlatGenerator} class provides methods to create and configure a {@code Flat} object.
 */
public class FlatGenerator implements Serializable {
    @Serial
    private static final long serialVersionUID = 576057594404003L;

    /**
     * Creates a new {@code Flat} object with the specified ID.
     * Prompts the user for various attributes and validates the inputs.
     *
     * @param id the ID of the flat
     * @return the created {@code Flat} object
     */
    public static Flat createFlat(Long id) {
        double x;
        long y;
        Coordinates coordinates;
        Long area;
        int numberOfRooms;
        Integer livingSpace;
        Long numberOfBathrooms;
        View view = null;
        Flat flat;
        House house = new House();
        if (id == null) {
            flat = new Flat();
        } else {
            flat = new Flat(id);
        }

        Scanner scanner = new Scanner(System.in);

        // Input for flat name
        while (true) {
            try {
                System.out.println("Введите имя: ");
                String name = scanner.nextLine().trim();
                if (name.contains(";")) {
                    System.out.println("Имя не может содержать символ ';'.");
                } else if (!name.isEmpty()) {
                    flat.setName(name);
                    break;
                } else {
                    System.out.println("Имя не может быть пустым.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Input for X coordinate
        while (true) {
            try {
                System.out.println("Введите координату x: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Координата x не может содержать символ ';'.");
                } else {
                    x = Double.parseDouble(input);
                    if (x <= -417) {
                        System.out.println("Координата x должна быть больше -417.");
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число.");
            }
        }

        // Input for Y coordinate
        while (true) {
            try {
                System.out.println("Введите координату y: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Координата y не может содержать символ ';'.");
                } else {
                    y = Long.parseLong(input);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число типа long.");
            }
        }

        coordinates = new Coordinates(x, y);
        flat.setCoordinates(coordinates);

        // Input for area
        while (true) {
            try {
                System.out.println("Введите площадь: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Площадь не может содержать символ ';'.");
                } else {
                    area = Long.parseLong(input);
                    if (area > 0) {
                        flat.setArea(area);
                        break;
                    } else if (area == 0) {
                        System.out.println("Площадь не может быть равной нулю.");
                    } else {
                        System.out.println("Площадь не может быть отрицательной.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Данное значение не подходит.");
            }
        }

        // Input for number of rooms
        while (true) {
            try {
                System.out.println("Введите количество комнат: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Количество комнат не может содержать символ ';'.");
                } else {
                    numberOfRooms = Integer.parseInt(input);
                    if (numberOfRooms > 0) {
                        flat.setNumberOfRooms(numberOfRooms);
                        break;
                    } else if (numberOfRooms == 0) {
                        System.out.println("Кол-во комнат не может быть равной нулю.");
                    } else {
                        System.out.println("Количество комнат не может быть отрицательным.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число.");
            }
        }

        // Input for living space
        while (true) {
            try {
                System.out.println("Введите жилое пространство: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Жилое пространство не может содержать символ ';'.");
                } else {
                    livingSpace = Integer.parseInt(input);
                    if (livingSpace > 0) {
                        flat.setLivingSpace(livingSpace);
                        break;
                    } else if (livingSpace == 0) {
                        System.out.println("Жилое пространство не может быть равной нулю.");
                    } else {
                        System.out.println("LivingSpace не может быть отрицательным.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число.");
            }
        }

        // Input for number of bathrooms
        while (true) {
            try {
                System.out.println("Введите количество ванных комнат: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Количество ванных комнат не может содержать символ ';'.");
                } else {
                    numberOfBathrooms = Long.parseLong(input);
                    if (numberOfBathrooms > 0) {
                        flat.setNumberOfBathrooms(numberOfBathrooms);
                        break;
                    } else if (numberOfBathrooms == 0) {
                        System.out.println("Кол-во ванн не может быть равной нулю.");
                    } else {
                        System.out.println("Количество ванных комнат не может быть отрицательным.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число.");
            }
        }

        // Input for view
        while (true) {
            try {
                System.out.println("Введите вид из доступных вариантов: STREET, YARD, PARK, NORMAL");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Вид не может содержать символ ';'.");
                } else {
                    if (Validator.intIsInt(input)) {
                        int index = Integer.parseInt(input);
                        View type = switch (index) {
                            case 1 -> View.STREET;
                            case 2 -> View.YARD;
                            case 3 -> View.PARK;
                            case 4 -> View.NORMAL;
                            default -> null;
                        };
                        if (type == null) {
                            System.out.println("слишком большое значение");
                        } else {
                            flat.setView(type);
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                try {
                    String input = scanner.nextLine().trim();
                    input = input.toUpperCase();
                    flat.setView(View.valueOf(input));
                    break;
                } catch (Exception a) {
                    System.out.println("Такого вида не существует");
                }
            }
        }

        // Input for house name
        while (true) {
            try {
                System.out.println("Введите имя дома: ");

                String name = scanner.nextLine().trim();
                if (name.contains(";")) {
                    System.out.println("Имя дома не может содержать символ ';'.");
                } else if (!name.isEmpty()) {
                    house.setName(name);
                    break;
                } else {
                    System.out.println("Имя не может быть пустым.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Input for house year
        while (true) {
            try {
                System.out.println("Введите год постройки дома: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Год не может содержать символ ';'.");
                } else {
                    Integer year = Integer.parseInt(input);
                    if (year > 0) {
                        house.setYear(year);
                        break;
                    } else if (year == 0) {
                        System.out.println("Год не может быть равен нулю.");
                    } else {
                        System.out.println("Год не может быть отрицательным.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число.");
            }
        }

        // Input for number of floors
        while (true) {
            try {
                System.out.println("Введите количество этажей: ");
                String input = scanner.nextLine().trim();
                if (input.contains(";")) {
                    System.out.println("Количество этажей не может содержать символ ';'.");
                } else {
                    Long nof = Long.parseLong(input);
                    if (nof > 0) {
                        house.setNumberOfFloors(nof);
                        break;
                    } else if (nof == 0) {
                        System.out.println("Кол-во этажей не может быть равной нулю.");
                    } else {
                        System.out.println("Количество этажей не может быть отрицательным.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число.");
            }
        }

        // Input for number of flats on floor
        while (true) {
            try {
                System.out.println("Введите количество квартир на этаже:");
                Long nofof = Long.parseLong(scanner.nextLine().trim());
                if (nofof > 0) {
                    house.setNumberOfFlatsOnFloor(nofof);
                    flat.setHouse(house);
                    break;
                } else if (nofof == 0){
                    System.out.println("Кол-во квартир на этаже не может быть равной нулю.");
                }else {
                    System.out.println("Количество квартир на этаже не может быть отрицательным.");
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число.");
            }
        }

        System.out.println("Generation completed");
        return flat;
    }

    /**
     * Compares this object with the specified object for order.
     *
     * @param o the object to be compared
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
     */
}

