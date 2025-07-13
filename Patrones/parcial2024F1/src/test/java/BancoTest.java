import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class BancoTest {
    private Banco banco;

    @BeforeEach
    void setUp() {
        banco = new Banco(0.05);
    }

    @Test
    void testSimple() {
        Cliente cli = new Cliente("Baltazar Menvielle", 5000);
        Simple sim = banco.solicitarPrestamoSimple(100, 10, cli);
        assertInstanceOf(Aceptado.class, sim.getEstado());
        assertEquals(5000, sim.getGastosSellado());
    }
}
