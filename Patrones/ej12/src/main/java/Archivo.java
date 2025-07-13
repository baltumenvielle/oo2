import java.util.List;

public class Archivo extends Elemento {
    private int tamanio;

    public String getNombre() { return this.nombre; }

    @Override
    public int getTamanio() { return this.tamanio; }
    @Override
    public Archivo archivoMasGrande() { return this; }
    @Override
    public Archivo archivoMasNuevo() { return this; }
    @Override
    public Elemento buscar(String nombre) { if (this.nombre.equals(nombre)) return this; else return null; }
    @Override
    protected void buscarHijos(String nombre, List<Elemento> encontrados) { if (this.nombre.equals(nombre)) encontrados.add(this); }
    @Override
    public String listadoDeContenido() { return this.getNombre(); }
}
