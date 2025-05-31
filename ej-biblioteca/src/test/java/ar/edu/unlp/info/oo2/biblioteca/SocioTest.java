package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SocioTest {
    private Socio s;

    @BeforeEach
    void setUp() {
        s = new Socio("Baltazar Menvielle", "baltazarmenvielle@gmail.com", "23359/7");
    }

    @Test
    void testConstructor() {
        assertEquals("Baltazar Menvielle", s.getNombre());
        assertEquals("baltazarmenvielle@gmail.com", s.getEmail());
        assertEquals("23359/7", s.getLegajo());
    }
}
