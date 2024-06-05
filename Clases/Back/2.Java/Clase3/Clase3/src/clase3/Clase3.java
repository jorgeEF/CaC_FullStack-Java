/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import java.util.*;

/**
 *
 * @author Jef
 */
// Clases y Objetos
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // -------------------------------------------------------------
        // Clase 3:
        // crear objeto concesionaria
        //Concesionaria con1 = new Concesionaria();
        //con1.agregarVehiculo(auto1);
        //con1.agregarVehiculo(auto2);

        //con1.mostrarInventario();
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        Concesionaria concesionaria = new Concesionaria();
        int opcion;

        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Modificar vehículo");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();// consumir salto de linea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el año del vehículo: ");
                    int anio = scanner.nextInt();
                    System.out.print("Ingrese el precio del vehículo: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, precio);
                    concesionaria.agregarVehiculo(vehiculo);
                    System.out.println("Vehiculo agregado exitosamente");

                    break;
                case 2:
                    concesionaria.mostrarInventario();
                    System.out.print("Ingrese el indice del vehiculo a modificar: ");
                    int indiceModificar = scanner.nextInt();
                    scanner.nextLine(); // consumir el salto de linea

                    indiceModificar--;
                    if (indiceModificar >= 0 && indiceModificar < concesionaria.getVehiculosEnVenta().size()) {
                        Vehiculo vehiculoModificar = concesionaria.getVehiculosEnVenta().get(indiceModificar);

                        System.out.print("Ingrese la marca del vehículo: ");
                        String nuevaMarca = scanner.nextLine();
                        System.out.print("Ingrese el modelo del vehículo: ");
                        String nuevoModelo = scanner.nextLine();
                        System.out.print("Ingrese el año del vehículo: ");
                        int nuevoAnio = scanner.nextInt();
                        System.out.print("Ingrese el precio del vehículo: ");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine();

                        vehiculoModificar.setMarca(nuevaMarca);
                        vehiculoModificar.setModelo(nuevoModelo);
                        vehiculoModificar.setAnio(nuevoAnio);
                        vehiculoModificar.setPrecio(nuevoPrecio);

                        System.out.println("Vehículo modificado correctamente");
                    }

                    break;
                case 3:
                    concesionaria.mostrarInventario();
                    System.out.print("Ingrese el indice del vehiculo a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    scanner.nextLine(); // consumir el salto de linea

                    indiceEliminar--;

                    if (indiceEliminar >= 0 && indiceEliminar < concesionaria.getVehiculosEnVenta().size()) {
                        Vehiculo vehiculoEliminar = concesionaria.getVehiculosEnVenta().get(indiceEliminar);

                        concesionaria.quitarVehiculo(vehiculoEliminar);

                        System.out.println("Vehiculo eliminado exitosamente");
                    }
                    break;

                case 4:
                    concesionaria.mostrarInventario();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
                
                default:
                    System.out.println("Opcion invalida");
                    
                    break;

            }

        } while (opcion != 5);
    }
}
