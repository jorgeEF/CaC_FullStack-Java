package com.ejemplos.conexion_24112;

import DAO.MiTablaDAO;
import java.util.List;
import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {

        MiTablaDAO dao = new MiTablaDAO();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Agregar registro");
            System.out.println("2. Ver todos los registros");
            System.out.println("3. Actualizar registro");
            System.out.println("4. Eliminar registro");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    dao.agregarRegistro(nombre, email);
                    break;

                case 2:
                    List<String[]> registros = dao.obtenerRegistros();
                    for (String[] registro : registros) {
                        System.out.println("ID: " + registro[0] + ", Nombre: " + registro[1] + ", Email: " + registro[2]);
                    }
                    break;

                case 3:
                    System.out.println("Registros disponibles:");
                    registros = dao.obtenerRegistros();
                    for (String[] registro : registros) {
                        System.out.println("ID: " + registro[0] + ", Nombre: " + registro[1] + ", Email: " + registro[2]);
                    }
                    System.out.print("ID del registro a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Nuevo nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Nuevo email: ");
                    email = scanner.nextLine();
                    dao.actualizarRegistro(idActualizar, nombre, email);
                    break;

                case 4:
                    System.out.println("Registros disponibles:");
                    registros = dao.obtenerRegistros();
                    for (String[] registro : registros) {
                        System.out.println("ID: " + registro[0] + ", Nombre: " + registro[1] + ", Email: " + registro[2]);
                    }
                    System.out.print("ID del registro a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    dao.eliminarRegistro(idEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
