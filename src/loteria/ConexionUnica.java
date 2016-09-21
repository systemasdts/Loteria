package loteria;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionUnica {

    private static Connection Con;

    public Connection conexion() {

        if (Con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection("jdbc:mysql://localhost/loteria", "root", "");
                System.out.println("Conexion realizada correctamente, mediante la clase ConexionUnica");
                 return Con;
                 
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error de Conexion: "+e);

            }
           
        }

        return Con;

    }
}
