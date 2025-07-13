import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private Directorio raiz;

    public int tamanioTotalOcupado() { return this.raiz.getTamanio(); }
    public Archivo archivoMasGrande() { return this.raiz.archivoMasGrande(); }
    public Archivo archivoMasNuevo() { return this.raiz.archivoMasNuevo(); }
    public Elemento buscar(String nombre) { return this.raiz.buscar(nombre); }
    public List<Elemento> buscarTodos(String nombre) {
        List<Elemento> elementos = new ArrayList<Elemento>();
        this.raiz.buscarTodos(nombre, elementos);
        return elementos;
    }
    public String listadoDeContenido() { return this.raiz.listadoDeContenido(); }
}
