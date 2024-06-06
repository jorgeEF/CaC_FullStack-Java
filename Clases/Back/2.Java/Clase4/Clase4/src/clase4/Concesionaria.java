/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

import java.util.ArrayList;

/**
 *
 * @author Jef
 */
public class Concesionaria {
    // lista de objetos vehiculo
    private ArrayList<Vehiculo> vehiculosEnVenta;
    
    public Concesionaria(){
        vehiculosEnVenta = new ArrayList<>();
    }
    
    // agrega un objeto vehículo
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculosEnVenta.add(vehiculo);
    }
    
    // quita un objeto vehiculo
    public boolean quitarVehiculo(Vehiculo vehiculo){
        return vehiculosEnVenta.remove(vehiculo);        
    }
    
    // metodo para mostrar el inventario de vehiculos en venta
    public void mostrarInventario(){
        if(vehiculosEnVenta.isEmpty()){
            System.out.println("No hay vehículos en el inventario");
        } else {
            System.out.println("Inventario de la concesionaria: ");
            // recorremos la lista de vehiculos en venta
            for(Vehiculo vehiculo : vehiculosEnVenta){
                vehiculo.mostrarDetalles();
                System.out.println("   ------------   ");
            }            
        }        
    }
    
    public ArrayList<Vehiculo> getVehiculosEnVenta(){
        return vehiculosEnVenta;
    }
    
}
