/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

/**
 *
 * @author Jef
 */
// Clases y Objetos
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // con la clase Vehiculo creada pordemos crear objetos de esta clase
         Vehiculo auto1 = new Vehiculo();
         Vehiculo auto2 = new Vehiculo("Renault","Clio",2000,7000000);
         
         // mostramos los detalles con su metodo mostrarDetalles
         auto1.mostrarDetalles();
         auto2.mostrarDetalles();
         
         // cambiamos valores de un objeto de la clase con su setter
         auto1.setMarca("Fiat");
         auto1.setModelo("Palio");
         
         // mostramos los detalles ahora y tiene los valores
         auto1.mostrarDetalles();
         
         // podemos mostrar los valores con los getter
         System.out.println("Año del auto 2: " + auto2.getAnio());
         
         
        }
}
