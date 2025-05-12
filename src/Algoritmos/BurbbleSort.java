package Algoritmos;

import java.util.Arrays;

public class BurbbleSort {
    public static void main(String[] args) {
        //Busqueda por Burbuja
        int[] array = {4, 3, 6, 5, 9, 1};
        int aux = 0;
        //metodo burbuja
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
