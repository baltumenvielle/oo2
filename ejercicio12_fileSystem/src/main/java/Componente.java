import java.time.LocalDate;
import java.util.List;

public abstract class Componente {
    protected String nombre;
    protected LocalDate fechaCreacion;

    public String getNombre() { return this.nombre; }
    public LocalDate getFechaCreacion() { return this.fechaCreacion; }

    public abstract int tamanioTotalOcupado();
    public abstract Archivo archivoMasGrande();
    public abstract Archivo archivoMasNuevo();
    public abstract Componente buscar(String nombre);
    public abstract List<Componente> buscarTodos(String nombre);
    public abstract String listadoDeContenido();
}
