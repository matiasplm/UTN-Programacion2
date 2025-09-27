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
public class Ejercicio9tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio, peso,costoEnvio,total;
        String zona;
       
        System.out.print("Ingrese el Precio del Producto: ");
        precio = Double.parseDouble(input.nextLine());  
        System.out.print("Ingrese el Peso ");
        peso = Double.parseDouble(input.nextLine());        
        System.out.print("Ingrese la Zona( Nacional /Internacional): ");
        zona = input.nextLine();
        
        // Calcular costos
        costoEnvio = calcularCostoEnvio(peso, zona);
        total = calcularTotalCompra(precio, costoEnvio);

        // Imprimimos el Resultado
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
    }
    
    //Metodo para calcular el envio
    private static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona no válida");
            return 0;
        }
    }

    //Metodo para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
 
       
}
