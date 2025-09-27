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
public class Ejercicio5tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int suma, num;
        
        suma = 0;
       
        System.out.print("Ingrese un número (0 para terminar): ");
        num = input.nextInt();
        
        while(num != 0) {
            if (num % 2 == 0){
                suma = suma + num;  
            }
            
            System.out.print("Ingrese un número (0 para terminar): ");
            num = input.nextInt();     
                  
        }        
     
        System.out.print("La suma de los números pares es: "+suma);
    }
    
}
