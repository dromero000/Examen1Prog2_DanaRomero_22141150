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
public class PorAccidenteRadioactivo extends Persona{
    
    //Atributos
    int edadAccidente;
    String tipoAccidente;
    

    public PorAccidenteRadioactivo(String nombre, String poder, String debilidad, String tipoHV, boolean escuadron, int fuerza, int agilidadF, int agilidadM, int edadAccidente, String tipoAccidente) {
        super(nombre, poder, debilidad, tipoHV, escuadron, fuerza, agilidadF, agilidadM);
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
    
    
    
    
}
