import java.util.List;

public class Decodificador {
    private Criterio criterio;
    private List<Pelicula> reproducidas, grilla;

    public List<Pelicula> getReproducidas() { return this.reproducidas; }
    public List<Pelicula> getGrilla() { return this.grilla; }

    public void cambiarCriterio(Criterio criterio) { this.criterio = criterio; }
    public List<Pelicula> sugerirPeliculas() { return this.criterio.sugerirPeliculas(this); }
}
