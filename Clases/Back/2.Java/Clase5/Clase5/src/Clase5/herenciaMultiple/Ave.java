/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase5.herenciaMultiple;

/**
 *
 * @author Jef
 */
// clase abstracta: se utiliza para definir una base comun para otras clases
// derivadas que deben implementar los metodos abstractos

// las clases abstractas no pueden ser instanciadas directamente

public abstract class Ave {
    // protected genera un atributo con accesibilidad limitada a la clase o subclases.
    protected String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void comer(); // metodo sin implementacion
    
}
