import java.time.LocalDate;

public class FileOO2 implements Componente {
    private String nombre, extension, permisos;
    private LocalDate fechaCreacion, fechaModificacion;
    private int tamano;

    @Override
    public String getNombre() { return this.nombre; }
    @Override
    public String getExtension() { return this.extension; }
    @Override
    public int getTamano() { return this.tamano; }
    @Override
    public LocalDate getFechaCreacion() { return this.fechaCreacion; }
    @Override
    public LocalDate getFechaModificacion() { return this.fechaModificacion; }
    @Override
    public String getPermisos() { return this.permisos; }
    @Override
    public String prettyPrint() { return this.getNombre(); }
}
