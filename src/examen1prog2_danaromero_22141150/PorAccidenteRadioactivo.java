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
public class PorAccidenteRadioactivo extends Persona{
    
    //Atributos
    int edadAccidente;
    String tipoAccidente;
    

    public PorAccidenteRadioactivo(String nombre, String poder, String debilidad, boolean tipoHV, int fuerza, int agilidadF, int agilidadM, int edadAccidente, String tipoAccidente) {
        super(nombre, poder, debilidad, tipoHV, fuerza, agilidadF, agilidadM);
        this.edadAccidente = edadAccidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAccidente() {
        return edadAccidente;
    }

    public void setEdadAccidente(int edadAccidente) {
        this.edadAccidente = edadAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    @Override
    public String toString() {
        return super.toString()+"PorAccidenteRadioactivo{" + "edadAccidente=" + edadAccidente + ", tipoAccidente=" + tipoAccidente + '}';
    }
    
    @Override
    public void finalChance(Persona p1, Persona p2) {
        Random rnd = new Random();
        int r = rnd.nextInt(3);
        switch(r){
            case 1:
                p1.setFuerza(p1.getFuerza()*4);
                break;
            case 2:
                p1.setAgilidadM(p1.getAgilidadM()*4);
                break;
            case 3:
                p1.setAgilidadF(p1.getAgilidadF()*4);
                break;
        }
    }
    
    
    
    
}
