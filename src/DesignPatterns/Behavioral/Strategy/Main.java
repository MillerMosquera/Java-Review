package DesignPatterns.Behavioral.Strategy;

import java.util.Arrays;

public class Main {
    /*
    * Permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.
    * */

    public static void main(String[] args) {
        int[] data = {5, 2, 3, 1, 4};
        System.out.println(Arrays.toString(data));
        SortingStrategy sortingStrategy = new BubbleSortStrategy();
        sortingStrategy.sort(data);
        System.out.println(Arrays.toString(data));

        int[] data2 = {5, 2, 3, 1, 4};
        SortingStrategy sortingStrategy2 = new QuickSortStrategy();
        sortingStrategy2.sort(data2);
        System.out.println(Arrays.toString(data2));

    }
}
