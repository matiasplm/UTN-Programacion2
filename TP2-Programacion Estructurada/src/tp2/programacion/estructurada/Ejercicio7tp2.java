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
public class Ejercicio7tp2 {
    
    static final int NOTA_MIN =0;
    static final int NOTA_MAX=10;
    
    public static void main(String[] args) {
        Scanner input  = new   Scanner(System.in);
        
        int nota;
         
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();
            if ( nota < NOTA_MIN || nota > NOTA_MAX){
                System.out.println("Nota inválida.");
            }          
        
        } while (nota < NOTA_MIN || nota > NOTA_MAX);
        
        System.out.println("Nota guardada correctamente");
        
    }
    
}
