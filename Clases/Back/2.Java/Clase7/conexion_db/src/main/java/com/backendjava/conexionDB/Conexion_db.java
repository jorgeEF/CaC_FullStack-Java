/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.backendjava.conexionDB;

import conexion.ConexionDB;
import java.sql.*;

/**
 *
 * @author Jef
 */
public class Conexion_db {

    public static void main(String[] args) {
        
        // Prueba de conexión
        
        try {
            // utilizamos los metodos proporcionados por JDBC para obtener la conexion.
            // la clase Connection es de JDBC.
            Connection conn = ConexionDB.conectar();
            if(conn != null){
                System.out.println("Conexión exitosa");
            }
            
            // Insertar un registro
            try {
                // consulta con parametros representados por ?
                String ConsultaSQL = "insert into miTabla (nombre,email) values(?,?)";

                // preparar una consulta sql con parametros
                PreparedStatement pstmt = conn.prepareStatement(ConsultaSQL);
                // instancia
                pstmt.setString(1, "Juan");
                pstmt.setString(2, "juan@mail.com");
                
                // ejecutar ocnsulta
                pstmt.executeUpdate();

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        
        // ------------------------------------------- //        
        
        
        
    }
}
