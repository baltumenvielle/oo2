import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pending extends State {
    @Override
    public void start() { this.task.setState(new InProgress()); }

    @Override
    public void togglePause() { throw new RuntimeException("La tarea no se encuentra en InProgress o Paused"); }

    @Override
    public void finish() { throw new RuntimeException("La tarea no se encuentra en InProgress o Paused"); }

    @Override
    public long workedTime() { return ChronoUnit.DAYS.between(task.getStartDate(), LocalDate.now()); }

    @Override
    public void addComment(String comment) { this.task.addAComment(comment); }
}