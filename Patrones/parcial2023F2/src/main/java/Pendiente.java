import java.time.LocalDate;

public class Pendiente implements Estado {
    @Override
    public void iniciarTarea(TareaSimple tarea) {
        tarea.setComienzo(LocalDate.now());
        tarea.setEstado(new Iniciada());
    }

    @Override
    public void completarTarea(TareaSimple tarea) {}
    @Override
    public int getTiempoUtilizado(TareaSimple tarea) { return 0; }
}
