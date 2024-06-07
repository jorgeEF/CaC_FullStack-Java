/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

import java.util.*;

/**
 *
 * @author Jef
 */
public class ManejadorVehiculos implements OperacionesVehiculo{
    
    private Concesionaria concesionaria;
    private Scanner scanner;
    
    public ManejadorVehiculos(){
        concesionaria = new Concesionaria();
        scanner = new Scanner(System.in);
        
    }

    @Override
    public void agregarVehiculo() {
        System.out.println("Ingrese el tipo de vehículo (1. Automóvil, 2. Camión): ");
        int tipoVehiculo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año del vehículo: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese el precio del vehículo: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        
        // crear objeto vehiculo segun tipo
        Vehiculo vehiculo = null;
        
        if(tipoVehiculo == 1){
            // solicitar datos específicos del automovil
            System.out.print("Ingrese el número de puertas del automovil: ");
            int numeroPuertas = scanner.nextInt();
            scanner.nextLine();
            vehiculo = new Automovil(marca,modelo,anio,precio,numeroPuertas);
        } else if (tipoVehiculo == 2){
            // solicitar datos específicos de camion
            System.out.print("Ingrese la capacidad de carga del camión: ");
            double capacidadCarga = scanner.nextDouble();
            scanner.nextLine();
            vehiculo = new Camion(marca,modelo,anio,precio,capacidadCarga);
        } else {
            System.out.println("tipo de vehiculo inválido");
            return;
        }
        
        // agregar vehiculo a la concesionaria        
        concesionaria.agregarVehiculo(vehiculo);        
        System.out.println("Vehículo agregado correctamente");
    }

    @Override
    public void modificarVehiculo() {
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
            
            if (vehiculoModificar instanceof Automovil){
                System.out.println("Ingrese el nuevo numero de puertas: ");
                int nuevoNumeroPuertas = scanner.nextInt();
                scanner.nextLine();
                ((Automovil) vehiculoModificar).setNumeroPuertas(nuevoNumeroPuertas);
            } else if (vehiculoModificar instanceof Camion){
                System.out.println("Ingrese el nuevo numero de capacidad de carga: ");
                double nuevaCapacidadCarga = scanner.nextDouble();
                scanner.nextLine();
                ((Camion) vehiculoModificar).setCapacidadCarga(nuevaCapacidadCarga);
            } else {
                System.out.println("Tipo vehiculo invalido");                
            }
        }
        
    }

    @Override
    public void eliminarVehiculo() {
        concesionaria.mostrarInventario();
        System.out.print("Ingrese el indice del vehiculo a eliminar: ");
        int indiceEliminar = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de linea

        indiceEliminar--;

        if (indiceEliminar >= 0 && indiceEliminar < concesionaria.getVehiculosEnVenta().size()) {
            Vehiculo vehiculoEliminar = concesionaria.getVehiculosEnVenta().get(indiceEliminar);

            concesionaria.quitarVehiculo(vehiculoEliminar);
        }
    }

    @Override
    public void mostrarVehiculo() {
       concesionaria.mostrarInventario();
    }
    
    
    
}
