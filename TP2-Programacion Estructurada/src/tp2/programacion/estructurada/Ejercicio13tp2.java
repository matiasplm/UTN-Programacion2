/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author Mati
 */
public class Ejercicio13tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0 , 89,99};
        
        //Muestra los valores originales de los precios
        System.out.println("Precios originales:");         
        impresorDeArrayRecur(precios,0);
        
        //Modificamos el precio de un producto específico
        precios[2] = 129.99;
        
        //Muestra los  los valores modificados
        System.out.println("Precios modificados: ");         
        impresorDeArrayRecur(precios,0);
        
    }
    
    // metodo que imprime array recur
    private static void impresorDeArrayRecur(double[] precio,int indice) {
        if(indice < precio.length ){
            System.out.println("Precio: $"+precio[indice]);
            impresorDeArrayRecur(precio, indice+1);
        }
    }
    
}
