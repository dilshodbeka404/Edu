package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Thu 3:50 PM. 2/16/23
 */
public class MapCollection {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        hahaMethod(map);
        System.out.println("map = " + map.get("2"));
        System.out.println("map = " + map.get("5"));
        System.out.println("map = " + map);
    }

    private static void hahaMethod(Map<Object, Object> map) {
        map.put("4", 4);
        map.put("6", 6);
    }
}
