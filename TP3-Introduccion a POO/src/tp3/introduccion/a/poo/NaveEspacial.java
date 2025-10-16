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
    
public NaveEspacial (String nombre, int combustible){
    this.nombre = nombre;
    this.combustible = combustible;
}

public boolean avanzar(int distancia){
    return distancia < combustible;    
}

private void despegar(){
    if (naveEspacial.avanzar){
        combustible -= distancia;           
    }
    else{
        System.out.println("Combustible Insuficiente para esa distancia");
    }       
}

public void recargarCombustible(int cantidad){
    if( (combustible + cantidad)<= 100) && cantidad > 0 );{ 
        combustible += cantidad;
    }
    else {
            System.out.println("");
            
    }
    
}


//despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
//Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que se supere el límite al recargar.
//Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
    
}
