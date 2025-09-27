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
public class Ejercicio8tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio, impuesto, descuento;
       
        System.out.print("Ingrese el Precio del Producto: ");
        precio = input.nextDouble();
        
        System.out.print("Ingrese el Inpuesto: ");
        impuesto = input.nextDouble();
        
        System.out.print("Ingrese el Descuento: ");
        descuento = input.nextDouble();
        
        System.out.print("El precio final es :"+ calcularPrecioFinal(precio,impuesto,descuento));
                       
    }
    
    //Metdo para calcular el precio final
    private static double calcularPrecioFinal(double precio, double impuesto, double descuento) {
       impuesto = precio * (impuesto / 100.0);
       descuento = precio * (descuento / 100.0);
       return precio + impuesto - descuento;
    
    }
}
    
