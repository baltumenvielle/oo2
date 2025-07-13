import java.util.List;

public class TareaCompleja extends Tarea {
    private List<Tarea> tareas;

    @Override
    public void iniciarTarea() { this.tareas.stream().forEach(tarea -> tarea.iniciarTarea()); }
    @Override
    public void completarTarea() { this.tareas.stream().forEach(tarea -> tarea.completarTarea()); }
    @Override
    public int getTiempoEstimado() { return this.tareas.stream().mapToInt(tarea -> tarea.getTiempoEstimado()).sum(); }
    @Override
    public int getTiempoUtilizado() { return this.tareas.stream().mapToInt(tarea -> tarea.getTiempoUtilizado()).sum(); }
}
