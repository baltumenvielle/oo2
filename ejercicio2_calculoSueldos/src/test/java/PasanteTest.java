import ar.edu.unlp.info.oo1.Pasante;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasanteTest {
    private Pasante p;

    @BeforeEach
    void setUp() {
        p = new Pasante("Baltazar Menvielle", 17);
    }

    @Test
    void testSueldoBasico() {
        assertEquals(p.sueldoBasico(), 20000);
    }

    @Test
    void testSueldoAdicional() {
        assertEquals(p.sueldoAdicional(), 34000);
    }
}
