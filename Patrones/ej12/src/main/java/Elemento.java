import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
    protected String nombre;
    protected LocalDate fechaCreacion;

    public String getNombre() { return this.nombre; }
    public LocalDate getFechaCreacion() { return this.fechaCreacion; }

    public void buscarTodos(String nombre, List<Elemento> encontrados) {
        if (this.nombre.equals(nombre)) encontrados.add(this);
        this.buscarHijos(nombre, encontrados);
    }

    protected abstract void buscarHijos(String nombre, List<Elemento> encontrados);
    public abstract int getTamanio();
    public abstract Archivo archivoMasGrande();
    public abstract Archivo archivoMasNuevo();
    public abstract Elemento buscar(String nombre);
    public abstract String listadoDeContenido();
}
