import java.time.LocalDate;

public class Presupuesto {
    private String nombre;
    private LocalDate fecha;
    private Constructor constructor;

    public Equipo armarEquipo() {
        this.constructor.reset();
        this.constructor.armarCPU();
        this.constructor.armarRAM();
        this.constructor.armarDisco();
        this.constructor.armarGPU();
        this.constructor.armarGabinete();
        this.constructor.armarFuente();
        return this.constructor.getEquipo();
    }
}
