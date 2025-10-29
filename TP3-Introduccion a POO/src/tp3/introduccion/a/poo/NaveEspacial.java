/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.introduccion.a.poo;

/**
 *
 * @author Mati
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private boolean despego;
    private int maxCombustible=200;
    
    
public NaveEspacial (String nombre, int combustible){
    this.nombre = nombre;
    this.combustible = combustible;
    this.despego = false;
}
       
public void despegar(){
    if (combustible > 0){
        System.out.println("Despegue exitoso");   
        despego = true;
    }
    else{
        System.out.println("No hay suficiente combustible para despegar");
    }       
}

public void avanzar(int distancia){
    if (!despego){
        System.out.println("La nave no despego");       
    }
    else if (combustible > distancia){
        combustible -= distancia;
        System.out.println("La nave avanzo "+ distancia +" de años luz");
    }
    else{
        System.out.println("No hay suficiente combustible para esa distancia");
    } 
}

public void recargarCombustible(int cantidad){
    if (cantidad + combustible <= maxCombustible){
        combustible += cantidad;
        System.out.println("Combustible Cargado correctamente");
    }
    else {
        System.out.println(cantidad +" Excede el limite de carga de: " + maxCombustible);
    }
} 


public void mostrarEstado(){
    System.out.println("La nave :" + nombre);
    System.out.println("Combustible dispobible: " +combustible);
    
}
    
    
    
}
