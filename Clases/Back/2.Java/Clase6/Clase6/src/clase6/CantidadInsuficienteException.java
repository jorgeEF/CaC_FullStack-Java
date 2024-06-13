/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Jef
 */
public class CantidadInsuficienteException extends Exception {
    // creamos una excepcion personalizada
    public CantidadInsuficienteException(String mensaje){
        super(mensaje);
    }
    
}
