package DAO;

import conexion.ConexionDB;
import java.sql.*;
import java.util.*;

public class MiTablaDAO {

    public void agregarRegistro(String nombre, String email) {
        // Consulta SQL para insertar datos en la tabla
        String SQL = "INSERT INTO miTabla (nombre, email) VALUES (?, ?)";

        try {
            // Establecer conexión
            Connection conn = ConexionDB.getConnection();
            // Preparar la consulta
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            // Asignar valores a los parámetros de la consulta
            pstmt.setString(1, nombre);
            pstmt.setString(2, email);
            // Ejecutar la consulta de actualización
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Imprimir la traza de la excepción en caso de error
        }

    }
    // Método para LEER TODOS LOS REGISTROS

    public List<String[]> obtenerRegistros() {
        List<String[]> registros = new ArrayList<>();
        // Consulta SQL para seleccionar todos los registros
        String SQL = "SELECT * FROM miTabla";
        try {
            // Establecer conexión
            Connection conn = ConexionDB.getConnection();
            // Preparar la consulta
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            // Ejecutar la consulta y obtener los resultados
            ResultSet rs = pstmt.executeQuery();
            // Iterar sobre los resultados
            while (rs.next()) { // next() obtener el siguiente elemento
                // Almacenar los datos de cada registro en un array y añadirlo a la lista
                String[] registro = {rs.getString("id"), rs.getString("nombre"), rs.getString("email")};
                registros.add(registro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registros; // Devolver la lista de registros
    }
    
    // Método para ACTUALIZAR UN REGISTRO
    public void actualizarRegistro(int id, String nombre, String email) {
         // Consulta SQL para actualizar
        String SQL = "UPDATE miTabla SET nombre = ?, email = ? WHERE id = ?";
        try {
            // Establecer conexión
            Connection conn = ConexionDB.getConnection();
            // Preparar la consulta
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            // Asignar valores a los parámetros de la consulta
            pstmt.setString(1, nombre);
            pstmt.setString(2, email);
            pstmt.setInt(3, id);

            // Ejecutar la consulta de actualización
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(); // Manejo de errores SQL
        }
    }
    
    // Método para ELIMINAR UN REGISTRO
    public void eliminarRegistro(int id) {
        String SQL = "DELETE FROM miTabla WHERE id = ?"; // Consulta SQL para eliminar
        try {
            // Establecer conexión
            Connection conn = ConexionDB.getConnection();
            // Preparar la consulta
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            // Asignar valor al parámetro de la consulta
            pstmt.setInt(1, id);

            // Ejecutar la consulta de actualización
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(); // Manejo de errores SQL
        }
    }

}
