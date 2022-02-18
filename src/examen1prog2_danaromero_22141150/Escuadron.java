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
public class Escuadron {
    
    //Atributos
    String nombre, lugarBase, lider, heroeVillano;
    
    ArrayList <Persona> miembros;

    public Escuadron(String nombre, String lugarBase, String lider, String heroeVillano, ArrayList<Persona> miembros) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.lider = lider;
        this.heroeVillano = heroeVillano;
        this.miembros = miembros;
    }
    
    
    
    public Persona unicoNombrePersona(String nombre){
        for(Persona p : miembros){
            if(nombre.equals(p.getNombre())){
                return p;
            }
        }
        return null;
    }
    
}
