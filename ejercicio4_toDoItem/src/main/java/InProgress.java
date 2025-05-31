import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InProgress extends State {
    @Override
    public void start() { throw new RuntimeException("Para empezar una tarea, debe estar en estado pending."); }

    @Override
    public void togglePause() { this.task.setState(new Paused()); }

    @Override
    public void finish() {
        this.task.setState(new Finished());
        this.task.setEndDate(LocalDate.now());
    }

    @Override
    public long workedTime() { return ChronoUnit.DAYS.between(task.getStartDate(), LocalDate.now()); }

    @Override
    public void addComment(String comment) { this.task.addAComment(comment); }
}
