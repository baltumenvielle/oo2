import java.time.Duration;
import java.time.LocalDate;

public class Finished implements Estado {
    @Override
    public void start(ToDoItem item) {}
    @Override
    public void togglePause(ToDoItem item) { throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress"); }
    @Override
    public void finish(ToDoItem item) {}
    @Override
    public Duration workedTime(ToDoItem item) { return Duration.between(LocalDate.now(), LocalDate.now().plusDays(1)); }
    @Override
    public boolean canComment(ToDoItem item) { return false; }
}
