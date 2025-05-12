package OOP.Ejercicios.Intermedios.GestionTareas;

import java.util.*;

public class Task {

    private UUID id;
    private String title;
    private String description;
    private TaskPriority priority;
    private boolean completed;

    public Task(String title, String description, TaskPriority priority) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return String.format("[ID: %s] %s - %s (%s) %s", id, title, description, priority, completed);
    }
}
