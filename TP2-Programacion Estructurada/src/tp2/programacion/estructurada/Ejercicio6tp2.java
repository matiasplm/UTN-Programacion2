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
public class Ejercicio6tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int  num, positivo, negativo, cero;
        
        num=0;
        positivo=0;
        negativo=0;
        cero=0;
        
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el numero "+ i +": ");
            num = input.nextInt();
            
            if (num > 0) {
                positivo ++ ;
            }
            else if(num < 0){     
                negativo ++;
            }
            else{
                cero ++;
            }
          }
        
        System.out.println("Resultados");
        System.out.println("Positivos: "+ positivo);
        System.out.println("Negativos: "+ negativo);
        System.out.println("Ceros: "+ cero);
                
    }
    
}
