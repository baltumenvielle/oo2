import java.time.Duration;

public interface Estado {
    void start(ToDoItem item);
    void togglePause(ToDoItem item);
    void finish(ToDoItem item);
    Duration workedTime(ToDoItem item);
    boolean canComment(ToDoItem item);
}
