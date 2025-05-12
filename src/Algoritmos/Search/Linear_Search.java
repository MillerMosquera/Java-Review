package Algoritmos.Search;

public class Linear_Search {
    public static void main(String[] args) {
        //Complejidad de Big O(n)
        //Consiste en recorrer una estructura de datos comparando cada elemento con el valor buscado
        int[] array = {1,2,3,4,5,6,7,8,9};
        int x = 5;
        for(int i : array){
            if(array[i] == x){
                System.out.println("Element is found at index: " + i);
            }
        }
        //Busqueda lineal recursiva
        LinearSearch linear = new LinearSearch();
        int[] array2 = {1,2,3,4,5};
        int number = array2.length;
        int x2 = 5;
        int position = linear.linearSearch(array2, number, x2);
        if(position == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is found at index: " + position);
        }
    }
    static class LinearSearch {
        int linearSearch(int[] array, int number, int x) {
            if (number < 0) {
                return -1;
            }
            if (array[number - 1] == x) {
                return number - 1;
            }
            return linearSearch(array, number - 1, x);
        }
    }
    //Explica el codigo de busqueda lineal por recursividad
    //El metodo recibe un array, el tamaño del array y el valor a buscar
    //Si el tamaño del array es menor a 0, retorna -1
    //Si el valor del array en la posicion del tamaño del array - 1 es igual al valor a buscar, retorna el tamaño del array - 1
    //Si no, retorna el metodo con el array, el tamaño del array - 1 y el valor a buscar
}
