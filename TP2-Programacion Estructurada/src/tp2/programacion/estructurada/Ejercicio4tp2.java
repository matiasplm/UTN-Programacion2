/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio4tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        String categoria;
        
        //Solicitud al Usuario
        System.out.print("Ingrese el Precio del Producto: ");
        precio = input.nextDouble();
        
        System.out.println("Ingrese la Categoria del producto (A, B o C). ");
        categoria = input.nextLine();
        
        switch(categoria){
            case "A":
                System.out.println("10% de descuento ");
            case "B":
                System.out.println("");
        }
       

         
    
    }
    
}
