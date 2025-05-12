package Algoritmos;

import java.util.Arrays;

public class QuickSort {
    /*
     * Quick Sort
     * Complejidad temporal: O(n log n) en el caso promedio
     * Método divide y vencerás, muy eficiente
     * */
    public static void main(String[] args) {

        int[] arreglo = {2, 5, 6, 1, 7};
        int n = arreglo.length;
        quickSort(arreglo, 0, n - 1);

        for (int val : arreglo) {
            System.out.print(val + " ");
        }
    }

    private static int partition(int[] arreglo, int low, int high) {
        //Elige el ultimo elemento como pivote
        int pivot = arreglo[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            //Si el elemento actual es menor o igual al pivote
            if (arreglo[j] < pivot) {
                i++;
                //Intercambiar arreglo[i] y arreglo[j]
                int aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        //Colocar el pivote en su posición correcta
        int aux = arreglo[i + 1];
        arreglo[i + 1] = arreglo[high];
        arreglo[high] = aux;

        return i + 1;
    }

    public static void quickSort(int[] arreglo, int low, int high) {
        if (low < high) {
            //Particiona el arreglo
            int pivoteIndex = partition(arreglo, low, high);
            //Ordenar recursivamente las sub partes
            quickSort(arreglo, low, pivoteIndex - 1);
            quickSort(arreglo, pivoteIndex + 1, high);
        }
    }
}
