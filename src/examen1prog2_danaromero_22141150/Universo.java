/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1prog2_danaromero_22141150;

import java.util.ArrayList;

/**
 *
 * @author Dana Romero
 */
public class Universo {
    protected String nombre;
     ArrayList <Escuadron> squads;

    public Universo(String nombre) {
        this.nombre = nombre;
        squads = new ArrayList <Escuadron>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", squads=" + squads + '}';
    }
    
    
    
   
    
}
