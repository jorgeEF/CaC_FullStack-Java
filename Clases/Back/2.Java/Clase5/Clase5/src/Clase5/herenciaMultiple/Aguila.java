/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5.herenciaMultiple;

/**
 *
 * @author Jef
 */
public class Aguila extends Ave implements Volador{

    public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }
    
    @Override 
    public void volar(){
        System.out.println(nombre + " esta volando");
    }
    
}
