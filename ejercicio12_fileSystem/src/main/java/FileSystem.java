import java.util.List;

public class FileSystem {
    private Directorio root;

    public int tamanioTotal() { return this.root.tamanioTotalOcupado(); }
    public Archivo archivoMasGrande() { return this.root.archivoMasGrande(); }
    public Archivo archivoMasNuevo() { return this.root.archivoMasNuevo(); }
    public Componente buscar(String nombre) { return this.root.buscar(nombre); }
    public List<Componente> buscarTodos(String nombre) { return this.root.buscarTodos(nombre); }
    public String listadoDeContenido() { return this.listadoDeContenido(); }
}
