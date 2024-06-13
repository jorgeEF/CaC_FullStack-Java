/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

/**
 *
 * @author Jef
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // manejo de excepciones
        int numerador = 10;
        int denominador = 0;
        
        // intentamos dividir numerador en denominador
        // int resultado = numerador / denominador;
        
        //System.out.println("EL resultado de la división es: " + resultado);
        
        // creamos un bloque que haga pruebas del codigo
        try {            
            int resultado = numerador / denominador;
            System.out.println("EL resultado de la división es: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        }
        // ------------------------------------------------------ //
        
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(100);
        System.out.println("La cuenta tiene: " + cuenta.getSaldo());
        try {
            double cantidadRetirada = cuenta.retirar(150);
            System.out.println("Cantidad retirada: " + cantidadRetirada);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // --------------------------------------------------- //
        // manejo excepcion desde clase especifica
        Producto p = null;
        try {
            p = new Producto(1,"Tuerca", 1);
            System.out.println("El producto se creó");
        } catch (CantidadInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        if (p == null){
            System.out.println("No se pudo crear el producto");
        }
        
        // tratamos de establecer una cantidad        
        try {
            p.setCantidad(0);
            System.out.println("Cantidad: " + p.getCantidad());
        } catch (CantidadInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }    
}
