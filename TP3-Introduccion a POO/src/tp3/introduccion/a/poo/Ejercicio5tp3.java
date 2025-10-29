/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class Ejercicio5tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial ("Columbia",50);
        
        //estado inicial
        nave.mostrarEstado();
        
        //avanzar sin despegar
        nave.avanzar(20);
        
        //Despegar nave
        nave.despegar();
        
        //avazar con poco combustible
        nave.avanzar(60);
        
        //Recargar combustible
        nave.recargarCombustible(50);
        nave.mostrarEstado();
        
        //avanzar correctamente 
        nave.avanzar(60);
        
        nave.mostrarEstado();
      
        
        
        
        
    }
    
}
