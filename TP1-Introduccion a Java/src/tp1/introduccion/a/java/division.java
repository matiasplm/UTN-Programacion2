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
public class division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double num1,  num2;
         
         System.out.print("Ingrese el Primer Numero: ");
         num1 = input.nextInt();
         System.out.print("Ingrese el Segundo Numero: ");
         num2 =input.nextInt();
         
         System.out.println(num1+" / "+num2+ " = "+(num1/num2));
    }
    
}
