import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodificadorTest {
    private Decodificador dec;
    private Pelicula thor, cap, iron, dunk, rock, ram;

    @BeforeEach
    void setUp() {
        List<Pelicula> peliculas = new LinkedList<Pelicula>();

        thor = new Pelicula("Thor", 2007, 7.9);
        cap = new Pelicula("Capitan America", 2016, 7.8);
        iron = new Pelicula("Iron man", 2010, 7.9);
        dunk = new Pelicula("Dunkirk", 2017, 7.9);
        rock = new Pelicula("Rocky", 1976, 8.1);
        ram = new Pelicula("Rambo", 1979, 7.8);

        thor.agregarSimilar(cap);
        thor.agregarSimilar(iron);

        cap.agregarSimilar(iron);

        rock.agregarSimilar(ram);

        peliculas.add(thor);
        peliculas.add(cap);
        peliculas.add(rock);
        peliculas.add(ram);
        peliculas.add(iron);
        peliculas.add(dunk);

        dec = new Decodificador(peliculas);

        dec.agregarVista(thor);
        dec.agregarVista(rock);
    }

    @Test
    void testSimilaridad() {
        List<Pelicula> peliculasSimil = new LinkedList<Pelicula>();
        peliculasSimil.add(cap);
        peliculasSimil.add(iron);
        peliculasSimil.add(ram);

        dec.cambiarCriterio(new Similaridad());
        assertEquals(peliculasSimil, dec.sugerirPeliculas());

        List<Pelicula> peliculasPun = new LinkedList<Pelicula>();
        peliculasPun.add(dunk);
        peliculasPun.add(iron);
        peliculasPun.add(cap);

        dec.cambiarCriterio(new Puntaje());
        assertEquals(peliculasPun, dec.sugerirPeliculas());
    }
}