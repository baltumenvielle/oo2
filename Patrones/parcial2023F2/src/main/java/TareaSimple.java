import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TareaSimple extends Tarea {
    private Estado estado;
    private int estimada;
    private LocalDate comienzo, completada;

    public TareaSimple(String descripcion, int estimada) {
        super(descripcion);
        this.estimada = estimada;
        this.estado = new Pendiente();
        this.comienzo = null;
        this.completada = null;
    }

    public void setComienzo(LocalDate comienzo) { this.comienzo = comienzo; }
    public void setCompletada(LocalDate completada) { this.completada = completada; }

    public LocalDate getComienzo() { return this.comienzo; }
    public LocalDate getCompletada() { return this.completada; }
    public void setEstado(Estado estado) { this.estado = estado; }

    @Override
    public void iniciarTarea() { this.estado.iniciarTarea(this); }
    @Override
    public void completarTarea() { this.estado.completarTarea(this); }
    @Override
    public int getTiempoEstimado() { return this.estimada; }
    @Override
    public int getTiempoUtilizado() { return this.estado.getTiempoUtilizado(this); }
}
