/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase5;
import Clase5.herenciaMultiple.*;
/**
 *
 * @author Jef
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ave paloma1 = new Ave("paloma");
        
        // creamos instancias distintas clases / interfaces
        Aguila aguila = new Aguila("Aguila");
        Paloma paloma = new Paloma("Paloma");
        Pato pato = new Pato("Pato");
        
        System.out.println("nombre de la paloma: " + paloma.getNombre());
        paloma.comer();
        
        System.out.println("---------------------");        
        System.out.println("El aguila " + aguila.getNombre() + " puede:");
        aguila.comer();
        aguila.volar();
        System.out.println("---------------------");
        System.out.println("el pato " + pato.getNombre() + " puede:");
        pato.comer();
        pato.volar();
        pato.nadar();
        
        
        
    }
    
}
