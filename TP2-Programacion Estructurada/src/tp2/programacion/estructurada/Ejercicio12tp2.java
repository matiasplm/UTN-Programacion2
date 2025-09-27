/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author Mati
 */
public class Ejercicio12tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0 , 89,99};
        
        //Muestra los valores originales de los precios
        System.out.println("Precios originales:");         
        impresorDeArray(precios);
        
        //Modificamos el precio de un producto específico
        precios[2] = 129.99;
        
        //Muestra los  los valores modificados
        System.out.println("Precios modificados: ");         
        impresorDeArray(precios);
        
    }
    
    // metodo que imprime array
    private static void impresorDeArray(double[] precio) {
        for (int i = 0; i < precio.length; i++) {
            System.out.println("Precio: $"+precio[i]);
        }
    }
    
}
