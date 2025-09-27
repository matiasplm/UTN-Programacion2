/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class Ejercicio10tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        int stockActual, cantidadVendida,cantidadRecibida,nuevoStock;
        
        //Solicitud al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = input.nextInt();  
        System.out.print("Ingrese la cantidad vendida:");
        cantidadVendida = input.nextInt();        
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = input.nextInt(); 
        
        nuevoStock=  actualizarStock(stockActual,cantidadVendida,cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: "+ nuevoStock);
    }
    
    //Metodo para actualizar stock
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida; 
    }
}
