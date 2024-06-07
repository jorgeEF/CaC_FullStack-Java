/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author Jef
 */
public class Camion extends Vehiculo{
    private double capacidadCarga;
    
    public Camion(String marca, String modelo, int anio, double precio, double capacidadCarga){
        super(marca,modelo,anio,precio);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas.");      
    }
}
