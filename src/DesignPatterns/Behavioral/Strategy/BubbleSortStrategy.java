package DesignPatterns.Behavioral.Strategy;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        System.out.println("Using bubble Sort");

        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int aux = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = aux;
                }
            }
        }

        System.out.println("Sorting completed");
    }
}
