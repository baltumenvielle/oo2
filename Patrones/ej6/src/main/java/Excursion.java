import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre, puntoEncuentro;
    private LocalDate fechaInicio, fechaFin;
    private double costo;
    private int cupoMin, cupoMax;
    private List<Usuario> inscriptos;
    private List<Usuario> espera;
    private Estado estado;

    public Excursion(String nombre, String puntoEncuentro, LocalDate fechaInicio, LocalDate fechaFin, double costo, int cupoMin, int cupoMax) {
        this.nombre = nombre;
        this.puntoEncuentro = puntoEncuentro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.inscriptos = new ArrayList<Usuario>();
        this.espera = new ArrayList<>();
        this.estado = new Provisoria();
    }

    public void inscribirALista(Usuario usuario) { this.inscriptos.add(usuario); }
    public void inscribirAEspera(Usuario usuario) { this.espera.add(usuario); }

    public int getCantidadInscriptos() { return inscriptos.size(); }

    public String getNombre() { return this.nombre; }
    public String getPuntoEncuentro() { return this.puntoEncuentro; }
    public LocalDate getFechaInicio() { return this.fechaInicio; }
    public LocalDate getFechaFin() { return this.fechaFin; }
    public double getCosto() { return this.costo; }
    public int getCupoMin() { return this.cupoMin; }
    public int getCupoMax() { return this.cupoMax; }
    public List<Usuario> getInscriptos() { return this.inscriptos; }

    public void setEstado(Estado estado) { this.estado = estado; }
    public void inscribirUsuario(Usuario usuario) { this.estado.inscribirUsuario(this, usuario); }
    public String ofrecerInformacion() { return "Nombre de la excursión: " + this.getNombre() + "\n"
            + "Costo: " + this.getCosto() + "\n"
            + "Fecha de inicio: " + this.getFechaInicio() + "\n"
            + "Fecha de fin: " + this.getFechaFin() + "\n"
            + "Punto de encuentro: " + this.getPuntoEncuentro() + "\n"
            + this.estado.ofrecerInformacion(this); }
}
