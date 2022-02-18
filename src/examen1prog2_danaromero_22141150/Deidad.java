/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1prog2_danaromero_22141150;

/**
 *
 * @author Dana Romero
 */
public class Deidad extends Extraterrestre{
    
    //Atributos
    boolean creyentes;
    String religion;

    public Deidad(boolean creyentes, String religion, String nombre, String poder, String debilidad, String tipoHV, boolean escuadron, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipoHV, escuadron, fuerza, agilidadF, agilidadM);
        this.creyentes = creyentes;
        this.religion = religion;
    }

    public boolean isCreyentes() {
        return creyentes;
    }

    public void setCreyentes(boolean creyentes) {
        this.creyentes = creyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    
    
    
}
