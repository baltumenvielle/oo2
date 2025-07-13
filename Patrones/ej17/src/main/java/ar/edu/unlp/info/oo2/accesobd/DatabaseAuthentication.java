package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAuthentication implements DatabaseAccess {
    private DatabaseRealAccess db;
    private String password;
    private boolean loggedIn;

    public void setLog(boolean loggedin) { this.loggedIn = loggedin; }
    public boolean isLoggedIn() { return this.loggedIn; }

    @Override
    public int insertNewRow(List<String> rowData) { if (this.isLoggedIn()) return this.db.insertNewRow(rowData); else return 0; }

    @Override
    public Collection<String> getSearchResults(String queryString) { if (this.isLoggedIn()) return this.db.getSearchResults(queryString); else return null; }

    public void login(String password) { if (password.equals(this.password)) this.setLog(true); }
}
