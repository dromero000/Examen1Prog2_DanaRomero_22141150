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
public class SuperHumano extends Persona {
    //Atributo
    String superpoder;

    public SuperHumano(String superpoder, String nombre, String poder, String debilidad, String tipoHV, boolean escuadron, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipoHV, escuadron, fuerza, agilidadF, agilidadM);
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
    
    
    
   
}
