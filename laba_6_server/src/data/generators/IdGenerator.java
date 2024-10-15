package data.generators;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;

public class IdGenerator implements Serializable {
    @Serial
    private static final long serialVersionUID = 576057594404004L;
    private static HashSet<Long> idList = new HashSet<>();
    /**
     *  Пустой конструктор для Id
     */
    public IdGenerator(){
        idList = new HashSet<>();
    }

    /**
     *  Метод для генерации Id
     * @return id
     */
    public static Long generateid(){
        Long id = (long)Math.floor(Math.random() * 386800) + 244;
        while (!idList.add(id))
            id = (long)Math.floor(Math.random() * 386800) + 244;
        return id;
    }

    /**
     *  Метод для удаления Id
     * @param id id
     */
    public static void remove(long id){
        idList.remove(id);
    }

    /**
     *  Метод для добавления Id
     * @param id id
     */
    public static void insert(long id){
        idList.add(id);
    }
}

