/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase1;
// importamos el paquete ArrayList para poder usar listas de arreglos
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jef
 */
public class Clase1 {
    
    // punto de entrada de nuestra aplicacion java
    // donde se inicia y finaliza el control del programa
    
    public static void main(String[] args) {
        // declaracion de variables y tipos de datos
        // tipo + nombre + asignacion
        int num1 = 1; // enteros
        double num2 = 3.14;// numero de punto flotante
        String cadena = "hola mundo";//cadena de texto
        
        // ------------------------------------------
        // Array
        // limitaciones: tamaño fijo, tipos homogeneos
        
        int [] numeros = {1,2,3,4,5};
        
        System.out.println("Numero en el indice 1: " + numeros[1]);
        
        // cambiamos el valor de un elemento
        numeros[1] = 10;
        System.out.println("Nuevo numero en indice 1: " + numeros[1]);
        
        // metodos en arreglos
        System.out.println("cantidad de numeros en el arreglo: " + numeros.length);
    
        // ----------------------------------------------------------
        // Lista de arreglos (requiere importacion de paquete)
        // ArrayList: dinamico y proporciona metodos para manipular elementos
        
        ArrayList<String> nombres = new ArrayList<>();
        
        // agregar elementos al array list
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Maria");
        
        // acceder a los elementos
        System.out.println("nombres posision 1: " + nombres.get(num1));
    
        // Bucles: obtener el tamaño de una lista de arreglo
        for(int i = 0;i < nombres.size();i++){
            System.out.println("Nombres en bucle for: " + nombres.get(i));
        }
        
        System.out.println("mostrando elementos en for-each");
        for (String elemento : nombres){
            System.out.println(elemento);
        }
        
        //acceder a un elemento en la posicion 1
        nombres.add(num1,cadena);
        System.out.println(nombres);
        
        // uso de Scanner (se debe importar)
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("ingresa tu edad: ");
        edad = input.nextInt();
        
        System.out.println("nombre " + nombre + ";edad " + edad);
    
    }
    
}
