import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Criterio {
    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        return decodificador.getGrilla().stream()
                .filter(pelicula -> !decodificador.getReproducidas().contains(pelicula))
                .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed()) // las de mayor puntaje primero
                .sorted(Comparator.comparing(Pelicula::getEstreno).reversed()) // las de mayor año de estreno primero
                .limit(3).collect(Collectors.toList());
    }
}
