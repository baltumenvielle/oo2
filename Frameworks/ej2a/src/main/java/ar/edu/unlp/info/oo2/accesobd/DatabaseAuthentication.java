package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class DatabaseAuthentication implements DatabaseAccess {
    private DatabaseRealAccess db;
    private String password;
    private boolean loggedIn;

    private static final Logger loggerAccesos = Logger.getLogger("db.accesos");
    private static final Logger loggerInserciones = Logger.getLogger("db.inserciones");
    private static final Logger loggerBusquedas = Logger.getLogger("db.busquedas");

    static {
        ConsoleHandler ch = new ConsoleHandler();
        ch.setFormatter(new SimpleFormatter());
        loggerAccesos.addHandler(ch);
        loggerInserciones.addHandler(ch);
        loggerBusquedas.addHandler(ch);
    }

    public void setLog(boolean loggedin) { this.loggedIn = loggedin; }
    public boolean isLoggedIn() { return this.loggedIn; }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (this.isLoggedIn()) {
            loggerInserciones.log(Level.WARNING, "Acceso válido");
            return this.db.insertNewRow(rowData);
        }
        else {
            loggerAccesos.log(Level.SEVERE, "Acceso inválido");
            return 0;
        }
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (this.isLoggedIn()){
            loggerBusquedas.log(Level.INFO, "Acceso válido");
            return this.db.getSearchResults(queryString);
        }
        else {
            loggerAccesos.log(Level.SEVERE, "Acceso inválido");
            return null;
        }
    }

    public void login(String password) { if (password.equals(this.password)) this.setLog(true); }
}
