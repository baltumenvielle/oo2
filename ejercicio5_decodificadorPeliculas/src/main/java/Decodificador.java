import java.util.LinkedList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> reproducidas;
    private Criterio criterio;

    public Decodificador(List<Pelicula> peliculas) {
        this.grilla = new LinkedList<Pelicula>(peliculas);
    }

    public void agregarVista(Pelicula p) { this.reproducidas.add(p); }

    public List<Pelicula> sugerirPeliculas() { return this.criterio.sugerirPeliculas(this); }

    public List<Pelicula> mostrarNoReproducidas() {
        List<Pelicula> noReproducidas = new LinkedList<>(grilla);
        noReproducidas.removeAll(reproducidas);
        return noReproducidas;
    }

    public void cambiarCriterio(Criterio criterio) { this.criterio = criterio; }
}
