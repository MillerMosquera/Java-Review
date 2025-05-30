package DesignPatterns.Behavioral.Strategy;

public class Sorter {

    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    private void performSort(int[] data){
        sortingStrategy.sort(data);
    }
}
