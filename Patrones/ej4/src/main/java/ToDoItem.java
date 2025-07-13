import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private List<String> comments;
    private Estado estado;
    private LocalDate startDate;

    public ToDoItem(String name) {
        this.name = name;
        this.estado = new Pending();
        this.startDate = LocalDate.now();
        this.comments = new ArrayList<>();
    }

    public void setEstado(Estado estado) { this.estado = estado; }
    public LocalDate getStartDate() { return this.startDate; }

    public void start() { this.estado.start(this); }
    public void togglePause() { this.estado.togglePause(this); }
    public void finish() { this.estado.finish(this); }
    public Duration workedTime() { return this.estado.workedTime(this); }
    public void addComment(String comment) { if (this.estado.canComment(this)) this.comments.add(comment); }
}
