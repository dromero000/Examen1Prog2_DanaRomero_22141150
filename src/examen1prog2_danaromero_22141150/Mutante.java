/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1prog2_danaromero_22141150;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dana Romero
 */
public class Mutante extends Persona {
    
    //Atributos
    ArrayList <String> factoresMutantes;

    public Mutante(String nombre, String poder, String debilidad, String tipoHV, boolean escuadron, int fuerza, int agilidadF, int agilidadM) {
        super(nombre, poder, debilidad, tipoHV, escuadron, fuerza, agilidadF, agilidadM);
        factoresMutantes = new ArrayList <String>();
    }

    public ArrayList<String> getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }

    
    @Override
    public void finalChance(Persona p1, Persona p2) {
        Random rnd = new Random();
        int r = rnd.nextInt(3);
        int r2 = rnd.nextInt(2);
        switch(r){
            case 1:
                p1.setFuerza((int)Math.round(p1.getFuerza()*2));
                switch(r2){
                    case 1:
                        p2.setAgilidadF(p2.getAgilidadF()/2);
                        break;
                    case 2:
                        p2.setAgilidadM(p2.getAgilidadF()/2);
                        break;
                }
                break;
            case 2:
                p1.setAgilidadM((int)Math.round(p1.getAgilidadM()*2));
                switch(r2){
                    case 1:
                        p2.setAgilidadF(p2.getAgilidadF()/2);
                        break;
                    case 2:
                        p2.setFuerza(p2.getFuerza()/2);
                        break;
                }
                break;
            case 3:
                p1.setAgilidadF((int)Math.round(p1.getAgilidadF()*2));
                switch(r2){
                    case 1:
                        p2.setFuerza(p2.getFuerza()/2);
                        break;
                    case 2:
                        p2.setAgilidadM(p2.getAgilidadF()/2);
                        break;
                }
                p2.setAgilidadM(p2.getAgilidadM()/2);
                break;
        }
    }
    
    
}
