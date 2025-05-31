package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {
    private Biblioteca b;

    @BeforeEach
    void setUp() {
        b = new Biblioteca();
    }

    @Test
    void testConstructor() {
        assertEquals("[]", b.exportarSocios());
    }
}
