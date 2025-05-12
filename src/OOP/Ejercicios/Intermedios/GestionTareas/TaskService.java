package OOP.Ejercicios.Intermedios.GestionTareas;

import java.util.List;

public class TaskService {
    private Taskrepo repository;
    private ITaskSorting sortingStrategy;

    public TaskService() {
        this.repository = Taskrepo.getInstance();
        this.sortingStrategy = new SortByPriority();
    }

    public void addTask(String title, String description, TaskPriority priority) {
        Task task = new Task(title, description, priority);
        repository.addTask(task);
    }

    public void setSortingStrategy(ITaskSorting strategy) {
        this.sortingStrategy = strategy;
    }

    public void listTasks() {
        List<Task> sortedTasks = sortingStrategy.sort(repository.getAllTask());
        sortedTasks.forEach(System.out::println);
    }
}
