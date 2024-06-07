/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

import java.util.*;

/**
 *
 * @author Jef
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejadorVehiculos manejadorVehiculos = new ManejadorVehiculos();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n==== Gestión de vehículos ====");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Modificar vehículo");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion){
                case 1: 
                    manejadorVehiculos.agregarVehiculo();
                    break;
                case 2:
                    manejadorVehiculos.modificarVehiculo();
                    break;
                case 3: 
                    manejadorVehiculos.eliminarVehiculo();
                    break;
                case 4:
                    manejadorVehiculos.mostrarVehiculo();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion inválida");                   
            }
        } while (opcion != 5);
        
    }
    
}
