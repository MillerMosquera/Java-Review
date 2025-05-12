package DataStructure;

import java.util.EnumMap;

public class EnumMaps {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }

    //EnumMap utiliza claves de enumeración, es una implementación de la Interfaz Map
    public static void main(String[] args) {

        EnumMap<Size, Integer> sizes = new EnumMap<>(Size.class);

        sizes.put(Size.SMALL, 1);
        sizes.put(Size.MEDIUM, 5);
        sizes.put(Size.LARGE, 10);
        sizes.put(Size.EXTRA_LARGE, 15);

        System.out.println(sizes);
        System.out.println(sizes.keySet());
        System.out.println(sizes.values());
        System.out.println(Size.SMALL);
    }
}
