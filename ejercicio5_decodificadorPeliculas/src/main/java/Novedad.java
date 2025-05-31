import java.util.List;

public class Novedad extends Criterio {

    @Override
    public List<Pelicula> aplicarCriterio(List<Pelicula> peliculas) {
        return peliculas.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getEstreno(), p1.getEstreno()))
                .toList();
    }
}
