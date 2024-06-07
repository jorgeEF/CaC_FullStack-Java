/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clase4;

/**
 *
 * @author Jef
 */
public interface OperacionesVehiculo {
    // las interfaces se utilizan para definir un contrato que las clases deben seguir
    // definiendo un conjunto de metodos que deben ser implementados por cualquiera de las clases
    // que implementen esta interfaz.
    // principios de abstraccion y polimorfismo
    
    void agregarVehiculo();
    
    void modificarVehiculo();
    
    void eliminarVehiculo();
    
    void mostrarVehiculo();
    
}
