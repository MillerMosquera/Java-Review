package OOP.Ejercicios.Intermedios.GestionTareas;

import java.util.ArrayList;
import java.util.List;

public class Taskrepo {

    private static Taskrepo instance;
    private List<Task> tasks;

    private Taskrepo() {
        tasks = new ArrayList<>();
    }

    public static Taskrepo getInstance() {
        if (instance == null) {
            instance = new Taskrepo();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTask() {
        return tasks;
    }
}
