import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Excursion {
    private String nombre, puntoEncuentro;
    private LocalDate fechaInicio, fechaFin;
    private int cupoMin, cupoMax;
    private double costo;
    private Estado estado;
    private List<Usuario> inscriptos;

    public Excursion(String nombre, String puntoEncuentro, LocalDate fechaInicio, LocalDate fechaFin, int cupoMin, int cupoMax, double costo) {
        this.nombre = nombre;
        this.puntoEncuentro = puntoEncuentro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.costo = costo;
        this.estado = new Provisoria(this);
        this.inscriptos = new LinkedList<Usuario>();
    }

    public void cambiarEstado(Estado estado) { this.estado = estado; }

    public void inscribir(Usuario usuario) {
        if (inscriptos.size() <= this.cupoMax+1) {
            inscriptos.add(usuario);
            if (inscriptos.size() >= this.cupoMin) this.cambiarEstado(new Disponible(this));
            if (inscriptos.size() == this.cupoMax) this.cambiarEstado(new Llena(this));
        }
    }

    public String getNombre() { return this.nombre; }
    public double getCosto() { return this.costo; }
    public LocalDate getFechaInicio() { return this.fechaInicio; }
    public LocalDate getFechaFin() { return this.fechaFin; }
    public String getPuntoEncuentro() { return this.puntoEncuentro; }
    public int getCupoMin() { return this.cupoMin; }
    public int getCupoMax() { return this.cupoMax; }
    public int getInscriptos() { return this.inscriptos.size(); }
    public Estado getEstado() { return this.estado; }

    public List<String> getMails() { return this.inscriptos.stream().map(Usuario::getEmail).toList(); }

    public String obtenerInformacion() {
        return "Excursión: " + this.getNombre() + "\n"
                + "Costo: " + this.getCosto() + "\n"
                + "Fecha de inicio: " + this.getFechaInicio() + "\n"
                + "Fecha de fin: " + this.getFechaFin() + "\n"
                + "Punto de encuentro: " + this.getPuntoEncuentro() + "\n"
                + this.estado.getInformacionAdicional();
    }
}
