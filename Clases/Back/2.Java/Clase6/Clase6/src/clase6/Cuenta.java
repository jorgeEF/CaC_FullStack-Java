/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Jef
 */
public class Cuenta {
    private double saldo;

    public Cuenta(){
        saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }
    
    public double retirar(double cantidad) throws Exception {
        if (cantidad > saldo){
            throw new Exception("No hay fondos suficientes");
        }
        saldo -= cantidad;
        return cantidad;
    }
    
}
