package managers;

import data.Coordinates;
import data.Flat;
import data.House;
import data.View;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Класс, отвечающий за конвертацию коллекции Flat в CSV-формат и обратно.
 */
public class CSVConverter {
    private static final String DELIMETER = ";";
    private static long maxId = 0;

    /**
     * Сериализует коллекцию Flat в CSV-формат и записывает ее в выходной поток.
     * @param flats коллекция Flat, которую нужно сериализовать
     * @param writer выходной поток, в который будет записан CSV-формат
     * @throws IOException если возникает ошибка ввода/вывода
     */
    public static void serializeToCSV(ArrayDeque<Flat> flats, BufferedOutputStream writer) throws IOException {
        StringBuilder out = new StringBuilder();
        for (Flat f : flats) {
            out.append(f.getId()).append(DELIMETER);
            out.append(f.getName()).append(DELIMETER);
            Coordinates f_cords = f.getCoordinates();
            out.append(f_cords.getX()).append(DELIMETER);
            out.append(f_cords.getY()).append(DELIMETER);
            out.append(f.getCreationDate()).append(DELIMETER);
            out.append(f.getArea()).append(DELIMETER);
            out.append(f.getNumberOfRooms()).append(DELIMETER);
            out.append(f.getLivingSpace()).append(DELIMETER);
            out.append(f.getNumberOfBathrooms()).append(DELIMETER);
            out.append(f.getView()).append(DELIMETER);
            House f_house = f.getHouse();
            out.append(f_house.getName()).append(DELIMETER);
            out.append(f_house.getYear()).append(DELIMETER);
            out.append(f_house.getNumberOfFloors()).append(DELIMETER);
            out.append(f_house.getNumberOfFlatsOnFloor()).append(DELIMETER);
            out.append("\n");
        }
        String text = out.toString();
        byte[] buffer = text.getBytes();
        writer.write(buffer);
    }

    /**
     * Десериализует CSV-формат в коллекцию Flat.
     * @param reader входной поток, содержащий CSV-формат
     * @return коллекция Flat, созданная из CSV-формата
     * @throws IOException если возникает ошибка ввода/вывода
     */
    public static ArrayDeque<Flat> deserializeFromCSV(InputStreamReader reader) throws IOException {
        ArrayDeque<Flat> collection = new ArrayDeque<>();
        try (BufferedReader bReader = new BufferedReader(reader)) {
            bReader.lines().forEach(el -> {
                String[] strEl = el.split(DELIMETER);
                Flat f;
                Long Id = Long.parseLong(strEl[0]);
                if (Id == 0){
                    f = new Flat();
                }
                else {
                    f = new Flat(Id);
                }
                f.setName(strEl[1]);
                Coordinates f_cords = new Coordinates(Double.parseDouble(strEl[2]), Long.parseLong(strEl[3]));
                f.setCoordinates(f_cords);
                f.setArea(Long.parseLong(strEl[5]));
                f.setNumberOfRooms(Integer.parseInt(strEl[6]));
                f.setLivingSpace(Integer.parseInt(strEl[7]));
                f.setNumberOfBathrooms(Long.parseLong(strEl[8]));
                if (View.contains(strEl[9])) {
                    f.setView(View.valueOf(strEl[9].toUpperCase()));
                }
                House f_House = new House();
                f_House.setName(strEl[10]);
                f_House.setYear(Integer.parseInt(strEl[11]));
                f_House.setNumberOfFloors(Long.parseLong(strEl[12]));
                f_House.setNumberOfFlatsOnFloor(Long.parseLong(strEl[13]));
                f.setHouse(f_House);
                collection.add(f);
            });
        }

        return collection;
    }
}

