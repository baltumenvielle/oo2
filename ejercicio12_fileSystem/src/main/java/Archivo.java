import java.util.List;

public class Archivo extends Componente {
    private int tamanio;

    public Archivo(int tamanio) { this.tamanio = tamanio; }

    public int getTamanio() { return this.tamanio; }

    @Override
    public int tamanioTotalOcupado() { return this.getTamanio(); }

    @Override
    public Archivo archivoMasGrande() { return this; }

    @Override
    public Archivo archivoMasNuevo() { return this; }

    @Override
    public Componente buscar(String nombre) { return this.getNombre().equals(nombre) ? this : null; }

    @Override
    public List<Componente> buscarTodos(String nombre) { return this.getNombre().equals(nombre) ? List.of(this) : List.of(); }

    @Override
    public String listadoDeContenido() { return this.getNombre() + "\n"; }
}
