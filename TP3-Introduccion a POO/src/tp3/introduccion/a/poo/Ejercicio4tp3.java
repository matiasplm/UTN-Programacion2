/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class Ejercicio4tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(10, 2, 4);
        Gallina gallina2 = new Gallina(11, 3, 5);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        gallina1.setPonerHuevos();
        gallina1.setEnvejecer();
        gallina1.mostrarEstado();
        
        gallina2.setPonerHuevos();
        gallina2.setEnvejecer();
        gallina2.mostrarEstado();      
              
              
        
    }
    
}
