/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author Jef
 */
public class Automovil extends Vehiculo{
    private int numeroPuertas;
    
    public Automovil(String marca, String modelo, int anio, double precio, int numeroPuertas){
        super(marca,modelo,anio,precio); // usamos constructor de la superclase
        this.numeroPuertas = numeroPuertas; // iniciamos atributo de subclase
        
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    // la subclase puede sobreescribir metodos de la superclase
    // para implementar algo especifico a la subclase
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
    
}
