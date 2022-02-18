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
public class SuperHumano extends Persona {
    //Atributo
    String superpoder;

    public SuperHumano( String nombre, String poder, String debilidad, boolean tipoHV, int fuerza, int agilidadF, int agilidadM,String superpoder) {
        super(nombre, poder, debilidad, tipoHV, fuerza, agilidadF, agilidadM);
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return super.toString()+"SuperHumano{" + "superpoder=" + superpoder + '}';
    }
    
    @Override
    public void finalChance(Persona p1, Persona p2) {
        Random rnd = new Random();
        int r = rnd.nextInt(3);
        switch(r){
            case 1:
                p1.setFuerza(p1.getFuerza()*4);
                p1.setAgilidadF(p1.getAgilidadF()/2);
                break;
            case 2:
                p1.setAgilidadM(p1.getAgilidadM()*4);
                p1.setFuerza(p1.getFuerza()/2);
                break;
            case 3:
                p1.setAgilidadF(p1.getAgilidadF()*4);
                p1.setAgilidadM(p1.getAgilidadM()/2);
                break;
        }
    }

    
    
    
    
    
    
    
    
   
}
