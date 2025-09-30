/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class Ejercicio1tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes estudianteA = new Estudiantes();
        
        //Imprimimos la informacion del estudiante
        estudianteA.getMostrarInfo();
        
        //Subimos la calificaion del estudiante
        estudianteA.setSubirCalificacion(5);               
        estudianteA.getMostrarInfo();
                
        //Bajamos la calificaion del estudiante
        estudianteA.setBajarCalificacion(2);
        estudianteA.getMostrarInfo();
                
        
    }
    
}
