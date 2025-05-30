package DesignPatterns.Behavioral.Strategy;

import static Algoritmos.QuickSort.quickSort;

public class QuickSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] data) {
        System.out.println("Perform quick sort algorithm");

        int n = data.length;
        quickSort(data, 0, n - 1);
        System.out.println("Sorting completed");
    }
}
