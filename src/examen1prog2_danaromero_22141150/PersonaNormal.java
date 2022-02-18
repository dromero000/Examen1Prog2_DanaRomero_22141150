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
public class PersonaNormal extends Persona{

    //Constructor
    public PersonaNormal(String nombre, String poder, String debilidad, boolean tipoHV, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipoHV, fuerza, agilidadF, agilidadM);
    }

    @Override
    public String toString() {
        return super.toString()+"PersonaNormal{" + '}';
    }

    @Override
    public void finalChance(Persona p1, Persona p2) {
        Random rnd = new Random();
        int r = rnd.nextInt(3);
        switch(r){
            case 1:
                p1.setFuerza((int)Math.round(p1.getFuerza()*1.5));
                break;
            case 2:
                p1.setAgilidadM((int)Math.round(p1.getAgilidadM()*1.5));
                break;
            case 3:
                p1.setAgilidadF((int)Math.round(p1.getAgilidadF()*1.5));
                break;
        }
    }

   
    
    
}
