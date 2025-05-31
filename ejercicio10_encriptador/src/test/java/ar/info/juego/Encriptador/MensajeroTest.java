package ar.info.juego.Encriptador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeroTest {
    private Mensajero mensajero;

    @BeforeEach
    void setUp() {
        mensajero = new Mensajero();
    }


    @Test
    void testFC() {
        mensajero.cambiarCifrado(new FCAdapter());
        mensajero.enviar("Hola");
    }

    @Test
    void testRC4() {
        mensajero.cambiarCifrado(new RCAdapter());
        mensajero.enviar("Hola");
    }
}
