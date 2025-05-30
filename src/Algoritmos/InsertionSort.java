package Algoritmos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {4, 3, 6, 5, 9, 1};
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            System.out.println(Arrays.toString(array));
        }
    }
}
