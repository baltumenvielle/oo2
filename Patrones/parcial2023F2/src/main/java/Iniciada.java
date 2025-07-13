import java.time.LocalDate;

public class Iniciada implements Estado {
    @Override
    public void iniciarTarea(TareaSimple tarea) {}
    @Override
    public void completarTarea(TareaSimple tarea) {
        tarea.setCompletada(LocalDate.now());
        tarea.setEstado(new Completada());
    }
    @Override
    public int getTiempoUtilizado(TareaSimple tarea) { return 0; }
}
