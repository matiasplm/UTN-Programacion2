/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class Gallina {
    private int idGallina;
    private int edad; 
    private int huevosPuestos;
    
    
public Gallina(int idGallina ,int edad ,int huevosPuestos ){
    this.idGallina = idGallina;
    this.edad = edad;
    this.huevosPuestos = huevosPuestos;
} 

public void mostrarEstado() {
    System.out.println("ID: "+ idGallina);
    System.out.println("Edad: "+ edad);
    System.out.println("Huevos Puesto: "+ huevosPuestos);      
}

public void setPonerHuevos(){
    this.huevosPuestos += 1;
}

public void setEnvejecer(){
    this.edad += 1;
}
 
    
}
