import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ReservaTest {
    private Reserva reserva;

    @BeforeEach
    void setUp() {
        AutoEnAlquiler a = new AutoEnAlquiler(60);
        reserva = new Reserva(5, LocalDate.of(2025, 7, 8), a);
    }

    @Test
    void testFlexible() {
        reserva.establecerPolitica(new Flexible());
        System.out.println(reserva.montoAReembolsar(LocalDate.now()));
    }

    @Test
    void testModerada() {
        reserva.establecerPolitica(new Moderada());
        System.out.println(reserva.montoAReembolsar(LocalDate.now()));
    }
}
