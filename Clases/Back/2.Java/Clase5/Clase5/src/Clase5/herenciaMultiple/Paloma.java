/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5.herenciaMultiple;

/**
 *
 * @author Jef
 */
public class Paloma extends Ave{

    public Paloma(String nombre) {
        super(nombre);
    }
    
    public void mostrar(){
        System.out.println("Nombre de la paloma: " + nombre);
    }
    
    @Override
    public void comer(){
        System.out.println(nombre + " esta comiendo semillas.");
    }
    
}
