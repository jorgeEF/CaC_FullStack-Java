/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.*;

/**
 *
 * @author Jef
 */
public class ConexionDB {
    private static final String url = "jdbc:mysql://localhost:3306/cac_crud";
    private static final String user = "root";
    private static final String password = "";
    
    // metodo estático: miClase.metodoEstatico();
    // metodo que pertenece a la clase, no a una instancia y se lo puede usar directamente.
    
    // Connection en el nombre del metodo indica que va a decolver un objeto tipo Connection
    public static Connection conectar() throws SQLException{
        // utilizamos el metodo getConnection() de DriverManager proporsionado por JDBC.
        return DriverManager.getConnection(url, user, password);
    }
    
}
