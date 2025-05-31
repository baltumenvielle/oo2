package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {
    private boolean loggeado = false;
    private String password;
    private DatabaseRealAccess acceso;

    public DatabaseAccessProxy(String password) {
        this.password = password;
        this.acceso = new DatabaseRealAccess();
    }

    public boolean isLoggeado() { return this.loggeado; }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (this.isLoggeado()) { return this.acceso.getSearchResults(queryString); }
        throw new IllegalArgumentException("El usuario no se encuentra loggeado.");
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (this.isLoggeado()) { return this.acceso.insertNewRow(rowData); }
        throw new IllegalArgumentException("El usuario no se encuentra loggeado.");
    }

    public void login(String password) {
        if (this.password.equals(password)) this.loggeado = true;
        else throw new RuntimeException("La password es incorrecta.");
    }
}
