import java.util.List;

public class Similaridad extends Criterio {

    @Override
    public List<Pelicula> aplicarCriterio(List<Pelicula> peliculas) {
        return peliculas.stream()
                .flatMap(pelicula -> pelicula.getSimilares().stream())
                .distinct()
                .sorted((p1, p2) -> Integer.compare(p2.getEstreno(), p1.getEstreno()))
                .toList();
    }
}
