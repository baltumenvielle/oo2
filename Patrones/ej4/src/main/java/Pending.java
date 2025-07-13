import java.time.Duration;

public class Pending implements Estado {
    @Override
    public void start(ToDoItem item) { item.setEstado(new InProgress()); }
    @Override
    public void togglePause(ToDoItem item) { throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress"); }
    @Override
    public void finish(ToDoItem item) {}
    @Override
    public Duration workedTime(ToDoItem item) { throw new RuntimeException("No se puede calcular el tiempo si la tarea no se inició"); }
    @Override
    public boolean canComment(ToDoItem item) { return true; }
}
