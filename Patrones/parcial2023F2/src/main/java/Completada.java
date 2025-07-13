import java.time.temporal.ChronoUnit;

public class Completada implements Estado {
    @Override
    public void iniciarTarea(TareaSimple tarea) {}
    @Override
    public void completarTarea(TareaSimple tarea) {}
    @Override
    public int getTiempoUtilizado(TareaSimple tarea) { return (int) ChronoUnit.DAYS.between(tarea.getComienzo(), tarea.getCompletada()); }
}
