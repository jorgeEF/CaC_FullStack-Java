
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    
    private static final String url = "jdbc:mysql://localhost:3306/baseDatos_24112";
    private static final String user = "root";
    private static final String password = "";
    
    
    //metodo estatico que devuelve una conexion a una base de datos
    //(pertenecen a la clase,no a una instancia)
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
    
}
