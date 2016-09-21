package loteria;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conectar {

    Connection Con = null;

    public Connection conexion() {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost/loteria", "root", "");
            System.out.println("Conexion exitosamente mediante la clase Conectar");
            
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error de Conexion.");

        }
        return Con;
    }
}
