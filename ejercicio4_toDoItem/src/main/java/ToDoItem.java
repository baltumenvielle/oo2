import java.time.LocalDate;
import java.util.List;

public class ToDoItem {
    private String name;
    private LocalDate startDate, endDate;
    private State state;
    private List<String> comments;

    public void start() { this.state.start(); }
    public void togglePause() { this.state.togglePause(); }
    public void finish() { this.state.finish(); }
    public long workedTime() { return this.state.workedTime(); }
    public void addComment(String comment) { this.state.addComment(comment); }

    public void setState(State state) {
        this.state = state;
    }
    public void addAComment(String comment) {
        comments.add(comment);
    }
    public LocalDate getStartDate() {
        return this.startDate;
    }
    public LocalDate getEndDate() {
        return this.endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
