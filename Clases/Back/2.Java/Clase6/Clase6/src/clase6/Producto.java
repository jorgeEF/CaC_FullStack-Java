/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Jef
 */
public class Producto {
    private int id;
    private String nombre;
    int cantidad;

    public Producto(int id, String nombre, int cantidad) throws CantidadInsuficienteException {
        if (cantidad >= 0) {
            this.id = id;
            this.nombre = nombre;
            this.cantidad = cantidad;            
        } else {
            throw new CantidadInsuficienteException("No puedes añadir un producto con una cantidad menor a 0");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) throws CantidadInsuficienteException {
        if (cantidad < 0){
           throw new CantidadInsuficienteException("No puedes setear un producto con una cantidad menor a 0");    
        } else {
            this.cantidad = cantidad;
        }    
    }
    
    
    
    
    
}
