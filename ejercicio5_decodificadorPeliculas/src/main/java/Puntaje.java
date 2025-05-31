import java.util.List;

public class Puntaje extends Criterio {

    @Override
    public List<Pelicula> aplicarCriterio(List<Pelicula> peliculas) {
        return peliculas.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
                .toList();
    }
}
