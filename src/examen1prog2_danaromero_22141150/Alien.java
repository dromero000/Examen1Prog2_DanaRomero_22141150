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
public class Alien extends Extraterrestre{
    
    //Atributos
    String planeta;

    public Alien(String planeta, String nombre, String poder, String debilidad, boolean tipoHV, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipoHV, fuerza, agilidadF, agilidadM);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return super.toString()+"Alien{" + "planeta=" + planeta + '}';
    }
    
    @Override
    public void finalChance(Persona p1, Persona p2) {
        Random rnd = new Random();
        int r = rnd.nextInt(3);
        switch(r){
            case 1:
                p2.setAgilidadF(p2.getAgilidadF()/2);
                p2.setFuerza(p2.getFuerza()/2);
                break;
            case 2:
                p2.setFuerza(p2.getFuerza()/2);
                p2.setAgilidadM(p2.getAgilidadM()/2);
                break;
            case 3:
                p2.setAgilidadM(p2.getAgilidadM()/2);
                p2.setAgilidadF(p2.getAgilidadF()/2);
                break;
        }
    }
    
    
    
}
