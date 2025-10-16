/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
      
    
public Libro(String titulo, String autor, int anioPublicacion){
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;    
}

public void setAnioPublicacion(int anio) {
        if (anio >= 1400 && anio <= 2025) { // Validamos un rango razonable
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año de publicación inválido: " + anio);
        }
    }

// Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("️Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
          
    
}
