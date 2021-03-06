/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1prog2_danaromero_22141150;

import java.util.Random;

/**
 *
 * @author Dana Romero
 */
public abstract class Persona {
    
    //Atributos
    protected String nombre, poder, debilidad;
    protected boolean tipoHV, escuadron;
    protected int fuerza, agilidadF, agilidadM, nivelTotal;
    
    //Constructor

    public Persona(String nombre, String poder, String debilidad, boolean tipoHV, int fuerza, int agilidadF, int agilidadM) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.tipoHV = tipoHV;
        this.escuadron = false;
        this.fuerza = fuerza;
        this.agilidadF = agilidadF;
        this.agilidadM = agilidadM;
        nivelTotal= agilidadM+agilidadF+fuerza;
        
    }
    
    //Funciones 
    
    public abstract void finalChance(Persona p1, Persona p2);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public boolean isEscuadron() {
        return escuadron;
    }

    public void setEscuadron(boolean escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadF() {
        return agilidadF;
    }

    public void setAgilidadF(int agilidadF) {
        this.agilidadF = agilidadF;
    }

    public int getAgilidadM() {
        return agilidadM;
    }

    public void setAgilidadM(int agilidadM) {
        this.agilidadM = agilidadM;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuadron=" + escuadron + ", fuerza=" + fuerza + ", agilidadF=" + agilidadF + ", agilidadM=" + agilidadM + '}';
    }
    
    
    
    
}
