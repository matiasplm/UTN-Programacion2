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
public class Ejercicio1tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        
        //Solitud al usuario 
        System.out.print("Ingrese un Año: ");
        year = input.nextInt();
        
        //Verificar si el año cumple con las condiciones para ser bisiesto
        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println(year+" Es un Año bisiesto");            
        }
        else{
            System.out.println(year+" No es un Año bisiesto");
        }      
                
                
    }
    
}
