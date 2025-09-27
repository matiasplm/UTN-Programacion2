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
        double precio, precioFinal;
        String categoria, descuento;
        
        //Incializamos Variables
        precioFinal = 0;
        descuento = "";
        
        //Solicitud al Usuario
        System.out.print("Ingrese el Precio del Producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la Categoria del producto (A, B o C). ");
        categoria = input.nextLine();
        
        //
        switch(categoria){
            case "A":
                precioFinal = precio-precio* 0.10;
                descuento ="10%";
                break;
                
            case "B":
                precioFinal = precio-precio* 0.15;
                descuento ="15%";
                break;
                
            case "C":
                precioFinal = precio-precio* 0.20;
                descuento ="20%";
                break;
         
            default:
                System.out.println("La categoria ingresa es incorrecta");
                precioFinal = precio;
                descuento = "0%";
                break;
        }
        
        //Imprimomos el Resultado
        System.out.println("El precio del Producto es: " + precio);
        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El precio final es: " + precioFinal);
              
    
    }
    
}
