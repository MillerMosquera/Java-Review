package OOP.Ejercicios.Intermedios.GestionTareas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public interface ITaskSorting {
    List<Task> sort(List<Task> tasks);
}

class SortByPriority implements ITaskSorting {
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getPriority))
                .collect(Collectors.toList());
    }
}

class SortByTitle implements ITaskSorting {
    public List<Task> sort(List<Task> tasks) {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getTitle))
                .collect(Collectors.toList());
    }
}

