import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ExcursionTest {
    private Excursion e;

    @BeforeEach
    void setUp() {
        e = new Excursion("Dos días en kayak bajando el Paraná", "Gualeguaychú", LocalDate.of(2025, 8, 13), LocalDate.of(2025, 8, 15), 1, 2, 5000);
    }

    @Test
    void testConstructor() {
        assertInstanceOf(Provisoria.class, e.getEstado());
        assertEquals(0, e.getInscriptos());
    }

    @Test
    void testEstados() {
        System.out.println(e.obtenerInformacion());
        e.inscribir(new Usuario("Baltazar", "Menvielle", "baltazarmenvielle@gmail.com"));
        assertInstanceOf(Disponible.class, e.getEstado());
        System.out.println(e.obtenerInformacion());
        e.inscribir(new Usuario("Emma", "Remes Lenicov", "emmaremeslenicov@gmail.com"));
        assertInstanceOf(Llena.class, e.getEstado());
        System.out.println(e.obtenerInformacion());
    }
}
