/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion; 
   

        
    
    public void getMostrarInfo(){
        System.out.println("Nombre :" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void  setSubirCalificacion( double puntos){
      calificacion += puntos;  
    }
    
    public void setBajarCalificacion( double puntos){
        calificacion -= puntos;
    }

    
}
