package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JsonSimpleAdapterTest {
    private JsonSimpleAdapter v;
    private Socio s1;
    private Socio s2;
    private List<Socio> l1;
    private List<Socio> l2;

    @BeforeEach
    void setUp() {
        v = new JsonSimpleAdapter();
        l1 = new LinkedList<>();
        l2 = new LinkedList<>();
        s1 = new Socio("Baltazar Menvielle", "baltazarmenvielle@gmail.com", "23359/7");
        s2 = new Socio("Emma Remes Lenicov", "emmaremeslenicov@gmail.com", "54667/5");
        l2.add(s1);
        l2.add(s2);
    }

    @Test
    void testExportar() {
        assertEquals("[]", v.exportar(l1));

        String sep = System.lineSeparator();
        String expectedJson =
                "[" + sep +
                        "\t{" + sep +
                        "\t\t\"nombre\": \"Baltazar Menvielle\"," + sep +
                        "\t\t\"email\": \"baltazarmenvielle@gmail.com\"," + sep +
                        "\t\t\"legajo\": \"23359/7\"" + sep +
                        "\t}," + sep +
                        "\t{" + sep +
                        "\t\t\"nombre\": \"Emma Remes Lenicov\"," + sep +
                        "\t\t\"email\": \"emmaremeslenicov@gmail.com\"," + sep +
                        "\t\t\"legajo\": \"54667/5\"" + sep +
                        "\t}" + sep +
                        "]";

        assertEquals(expectedJson, v.exportar(l2));
    }
}