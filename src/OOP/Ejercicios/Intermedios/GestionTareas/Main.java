package OOP.Ejercicios.Intermedios.GestionTareas;

public class Main {
    public static void main(String[] args) {

        TaskService taskService = new TaskService();

        taskService.addTask("Mercar", "Ir al supermercado", TaskPriority.MEDIUM);
        taskService.addTask("Comprar", "Ir al centro comercial", TaskPriority.HIGH);

        System.out.println("\nTareas ordenadas");
        taskService.listTasks();

        taskService.setSortingStrategy(new SortByTitle());
        System.out.println("\nTareas ordenadas por título: ");
        taskService.listTasks();
    }
}
