import ar.edu.unlp.info.oo1.Temporario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {
    private Temporario t;

    @BeforeEach
    void setUp() {
        t = new Temporario("Baltazar Menvielle", 56, 4, true);
    }

    @Test
    void testSueldoBasico() {
        assertEquals(t.sueldoBasico(), 36800);
    }

    @Test
    void testSueldoAdicional() {
        assertEquals(t.sueldoAdicional(), 13000);
    }
}
