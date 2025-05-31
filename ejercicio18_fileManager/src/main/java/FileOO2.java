import java.time.LocalDate;

public class FileOO2 implements FileComponent {
    private String nombre, extension, permisos;
    private LocalDate fechaCreacion, fechaModificacion;
    private double tamanio;

    @Override
    public double getTamanio() { return this.tamanio; }
    @Override
    public String getNombre() { return this.nombre; }
    @Override
    public String getExtension() { return this.extension; }
    @Override
    public String getPermisos() { return this.permisos; }
    @Override
    public LocalDate getFechaCreacion() { return this.fechaCreacion; }
    @Override
    public LocalDate getFechaModificacion() { return this.fechaModificacion; }
    @Override
    public String prettyPrint() { return this.getNombre(); }
}
