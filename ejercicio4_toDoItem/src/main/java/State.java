public abstract class State {
    protected ToDoItem task;

    public abstract void start();
    public abstract void togglePause();
    public abstract void finish();
    public abstract long workedTime();
    public abstract void addComment(String comment);
}
