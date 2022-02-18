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
public class Alien extends Extraterrestre{
    
    //Atributos
    String planeta;

    public Alien(String planeta, String nombre, String poder, String debilidad, String tipoHV, boolean escuadron, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipoHV, escuadron, fuerza, agilidadF, agilidadM);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    
    
    
}
