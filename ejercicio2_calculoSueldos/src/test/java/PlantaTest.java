import ar.edu.unlp.info.oo1.Planta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {
    private Planta p;

    @BeforeEach
    void setUp() {
        p = new Planta("Baltazar Menvielle", 4, true, 20);
    }

    @Test
    void testSueldoBasico() {
        assertEquals(p.sueldoBasico(), 50000);
    }

    @Test
    void testSueldoAdicional() {
        assertEquals(p.sueldoAdicional(), 53000);
    }
}
