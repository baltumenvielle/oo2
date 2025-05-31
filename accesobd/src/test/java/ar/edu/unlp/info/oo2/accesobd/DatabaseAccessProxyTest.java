package ar.edu.unlp.info.oo2.accesobd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseAccessProxyTest {
    private DatabaseAccessProxy proxy;

    @BeforeEach
    void setUp() {
        proxy = new DatabaseAccessProxy("baltu24");
    }

    @Test
    void testLoginFallido() {
        proxy.login("nooo");
    }

    @Test
    void testLoginExitoso() {
        proxy.login("baltu24");
    }

    @Test
    void getSearchResultsExitoso() {
        proxy.login("baltu24");
        proxy.getSearchResults("no");
    }
}
