package loteria;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertarBD {

    private Connection Con;
    private String sentencia, error;

    public InsertarBD(Connection c, String sql) {
        this.Con = c;
        this.sentencia = sql;
        try {
            Statement st = Con.createStatement();
            st.execute(sentencia);
            error = null;
        } catch (SQLException ex) {
            error = ex.getMessage();
        }
    }

    public String ObtenerError() {
        return this.error;
    }
}
