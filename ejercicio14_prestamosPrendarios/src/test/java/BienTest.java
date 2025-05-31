import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BienTest {
    private Bien bien;

    @BeforeEach
    void setUp() {
        bien = new Combinado();
        bien.agregarBien(new Automovil(7000, 2023));
        bien.agregarBien(new Alquiler(LocalDate.of(2025, 11, 23), 60000));
    }

    @Test
    void testCombinado() {
        assertEquals(152800, bien.calcularValorPrendario());
    }
}
