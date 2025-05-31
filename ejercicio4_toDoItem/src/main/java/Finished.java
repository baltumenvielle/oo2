import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Finished extends State {
    @Override
    public void start() { throw new RuntimeException("Para empezar una tarea, debe estar en estado pending."); }

    @Override
    public void togglePause() { throw new RuntimeException("La tarea no se encuentra en InProgress o Paused"); }

    @Override
    public void finish() { throw new RuntimeException("La tarea no se encuentra en InProgress o Paused"); }

    @Override
    public long workedTime() { return ChronoUnit.DAYS.between(task.getStartDate(), task.getEndDate()); }

    @Override
    public void addComment(String comment) { this.task.addAComment(comment); }
}
