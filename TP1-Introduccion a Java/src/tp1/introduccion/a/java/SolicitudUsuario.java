/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.introduccion.a.java;

import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class SolicitudUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  nombre;
        int edad;
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es :" + edad);
        
    }
    
}
