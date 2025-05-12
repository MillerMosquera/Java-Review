package EjerciciosLogica;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class HashDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 1};

        boolean hasDuplicate = Arrays.stream(arr)
                .distinct()
                .count() < arr.length;

        System.out.println(hasDuplicate);
        if (hasDuplicate) {
            System.out.println("Hay número duplicados");

        } else System.out.println("No hay número duplicados");

        System.out.println("-----Otra manera-----");
        System.out.println(duplicado(arr));
        if (duplicado(arr)) {
            System.out.println("Hay número duplicados");
        } else System.out.println("No hay número duplicados");
    }

    //otra manera de hacerlo
    static boolean duplicado(int[] arr) {

        Set<Integer> comprobar = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (comprobar.equals(arr.length)) {
                return false;
            }
        }
        return true;
    }
}
