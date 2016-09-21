package loteria;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultasBD {

    private Connection Con;
    private ResultSet resultado;
    private ResultSetMetaData datos;
    private String[] columnas;
    private String consulta, error;

    public ConsultasBD(Connection c, String sql) {
        this.Con = c;
        this.consulta = sql;
        try {
            Statement st = Con.createStatement();
            resultado = st.executeQuery(consulta);
            datos = resultado.getMetaData();
            error = null;
        } catch (SQLException ex) {
            error = ex.getMessage();
        }
    }

    public String ObtenerError() {
        return this.error;
    }

    public ResultSet ObtenerResultado() {
        return this.resultado;
    }

    public String[] NombresColumnas() {
        try {
            int cantidad = datos.getColumnCount();
            this.columnas = new String[cantidad];
            for (int a = 0; a < cantidad; a++) {
                columnas[a] = datos.getColumnName(a + 1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.columnas;
    }
}
