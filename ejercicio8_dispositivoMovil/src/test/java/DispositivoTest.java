import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DispositivoTest {
    private Dispositivo d;

    @BeforeEach
    void setUp() {
        d = new Dispositivo();
    }

    @Test
    void testSendCRC16Wifi() {
        d.configurarCRC(new CRC16_Calculator());
        d.conectarCon(new WifiConn());
        assertEquals("Wifi: Cuando lo sabes lo sabes CRC: 15071", d.send("Cuando lo sabes lo sabes"));
    }

    @Test
    void testSendCRC32Wifi() {
        d.configurarCRC(new CRC32_Calculator());
        d.conectarCon(new WifiConn());
        assertEquals("Wifi: Cuando lo sabes lo sabes CRC: 224687028", d.send("Cuando lo sabes lo sabes"));
    }

    @Test
    void testSendCRC164G() {
        d.conectarCon(new ConnectionAdapter());
        d.configurarCRC(new CRC16_Calculator());
        assertEquals("4G: Cuando lo sabes lo sabes 15071", d.send("Cuando lo sabes lo sabes"));
    }

    @Test
    void testSendCRC324G() {
        d.conectarCon(new ConnectionAdapter());
        d.configurarCRC(new CRC32_Calculator());
        assertEquals("4G: Cuando lo sabes lo sabes 224687028", d.send("Cuando lo sabes lo sabes"));
    }

    @Test
    void testConectarCon() {
        assertEquals("Connection has changed", d.conectarCon(new ConnectionAdapter()));
        assertEquals("Connection has changed", d.conectarCon(new WifiConn()));
    }

    @Test
    void testConfigurarCRC() {
        assertEquals("CRC Configuration has changed", d.configurarCRC(new CRC32_Calculator()));
        assertEquals("CRC Configuration has changed", d.configurarCRC(new CRC16_Calculator()));
    }
}
