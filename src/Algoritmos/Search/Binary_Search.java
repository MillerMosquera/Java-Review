package Algoritmos.Search;

public class Binary_Search {
    public static void main(String[] args) {
        //Complejidad de Big O(log n)

        //Busqueda binarya usando el metodo Arrays.binarySearch
        //se divide repetidamente en dos mitades hasta que se encuentra la clave (elemento que se busca).
        /*
        int[] array = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(array, 5);

        if(index < 0){
            System.out.println("Element no found");
        } else {
            System.out.println("Element is found at index: " + index);
        }*/

        //Busqueda binaria por recursividad

        BinarySearch binary = new BinarySearch();

        int[] array = {1,2,3,4,5};
        int number = array.length;
        int x = 5;
        int position = binary.binarySearch(array,0,number-1, x);
        if(position == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is found at index: " + position);
        }

    }
    static class BinarySearch {

        int binarySearch(int[] array, int left, int right, int x){
            if (right >= left & left <= array.length-1){
                int medium = left + (right  - left) / 2;
                if(array[medium] == x) return medium;
                if(array[medium] > x) return binarySearch(array,left,medium-1, x);
                return binarySearch(array,medium + 1, right, x);
            }
            return -1;
        }
    }
}
