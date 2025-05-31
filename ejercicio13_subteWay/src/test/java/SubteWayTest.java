import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubteWayTest {
    private SubteWay subteWay;

    @BeforeEach
    void setUp() {
        subteWay = new SubteWay();
    }

    @Test
    void testVegano() {
        assertEquals(620, subteWay.hacerSandwich( new Vegano()).calcularPrecio());
    }

    @Test
    void testVegetariano() {
        assertEquals(420, subteWay.hacerSandwich( new Vegetariano()).calcularPrecio());
    }

    @Test
    void testClasico() {
        assertEquals(500, subteWay.hacerSandwich( new Clasico()).calcularPrecio());
    }

    @Test
    void testSinTACC() {
        assertEquals(618, subteWay.hacerSandwich( new SinTACC()).calcularPrecio());
    }
}
