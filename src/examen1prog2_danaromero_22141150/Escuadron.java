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
    String nombre, lugarBase, lider;
    boolean heroeVillano;
    
    ArrayList <Persona> miembros;

    public Escuadron(String nombre, String lugarBase, boolean heroeVillano) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.heroeVillano = heroeVillano;
        miembros = new ArrayList();
    }
    
    
    
    public Persona unicoNombrePersona(String nombre){
        for(Persona p : miembros){
            if(nombre.equals(p.getNombre())){
                return p;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public boolean isHeroeVillano() {
        return heroeVillano;
    }

    public void setHeroeVillano(boolean heroeVillano) {
        this.heroeVillano = heroeVillano;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }
    
    
}
