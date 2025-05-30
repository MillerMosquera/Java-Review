package DataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map);

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        map.clear();
        System.out.println(map);

        //HashMap enlazado
        LinkedHashMap<String, Integer> evenNumber = new LinkedHashMap<String, Integer>();
        evenNumber.put("A", 1);
        evenNumber.put("B", 2);
        evenNumber.put("C", 3);
        System.out.println(evenNumber);
    }
}
