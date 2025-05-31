import java.util.List;
import java.util.stream.Collectors;

public abstract class Criterio {

    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        return this.aplicarCriterio(decodificador.mostrarNoReproducidas()).stream()
                                                    .limit(3)
                                                    .collect(Collectors.toList());
    }

    public abstract List<Pelicula> aplicarCriterio(List<Pelicula> peliculas);
}
