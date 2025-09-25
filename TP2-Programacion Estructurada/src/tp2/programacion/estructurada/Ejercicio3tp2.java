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
public class Ejercicio3tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        //Solicitud al Usuario
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un niño");
        }
        else if (edad >=12 && edad <= 17) {
            System.out.println("Eres un Menor");
        }
        else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");            
        }
        else
            System.out.println("Eres un Adulto Mayor");       
        
    }
    
}
