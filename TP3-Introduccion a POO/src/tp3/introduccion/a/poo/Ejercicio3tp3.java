/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class Ejercicio3tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Martin Fierro","Hernandez ",1872);
        
        libro1.mostrarInfo();        
        libro1.setAnioPublicacion(10);
        libro1.mostrarInfo(); 
        libro1.setAnioPublicacion(2020);
        libro1.mostrarInfo(); 
    }
    
}
