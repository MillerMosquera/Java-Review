package Algoritmos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        //Selection sort
        int[] array = {4,3,6,5,9,1};
        for(int i = 0; i < array.length-1; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            //Intercambiar array[i] con array[min]
            int aux = array[i];
            array[i] = array[min];
            array[min] = aux;
            System.out.println(Arrays.toString(array));
        }

    }
}
