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
public class Ejercicio2tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, mayor;
        
        //Solitud al usuario 
        System.out.print("Ingrese el Primer Numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese el Segundo Numero: ");
        num2 = input.nextInt();
        
        System.out.print("Ingrese el Tercer Numero: ");
        num3 = input.nextInt();
        
        //Verificamos cual es el mayor numero ingresado
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            mayor = num2;            
        }
        else{
            mayor = num3;
        }
        
        //Mostramos el resultado
        System.out.println("El mayor numero ingresado es: "+ mayor);
    }
    
}
