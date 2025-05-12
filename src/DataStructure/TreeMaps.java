package DataStructure;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {

        //Almacena pares clave, valor, es implementado como un árbol rojo-negro tipo binario
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        System.out.println(map);
    }
}
