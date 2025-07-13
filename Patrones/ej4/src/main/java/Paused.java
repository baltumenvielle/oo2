import java.time.Duration;
import java.time.LocalDate;

public class Paused implements Estado {
    @Override
    public void start(ToDoItem item) {}
    @Override
    public void togglePause(ToDoItem item) { item.setEstado(new InProgress()); }
    @Override
    public void finish(ToDoItem item) { item.setEstado(new Finished()); }
    @Override
    public Duration workedTime(ToDoItem item) { return Duration.between(item.getStartDate(), LocalDate.now()); }
    @Override
    public boolean canComment(ToDoItem item) { return true; }
}
