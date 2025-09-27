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
public class Ejercicio11tp2 {

    /**
     * @param args the command line arguments
     */
    
    //Variable global para el porcentaje de descuento
    static double porcentajeDescuento = 0.10;

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio, descuentoEspecial;
        
        //Solicitud al Usuario
        System.out.print("Ingrese el Precio del Producto: ");
        precio = Double.parseDouble(input.nextLine());  
        
        calcularDescuentoEspecial(precio);      
    }  
    
    //Metodo Calcular Descuento
    private static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * porcentajeDescuento;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
       
    
}
