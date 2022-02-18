/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1prog2_danaromero_22141150;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dana Romero
 */
public class Main {
    static ArrayList <Universo> listaUniverso = new ArrayList<>();
    
    public static void main(String[] args) {
       listaUniverso.add(new Universo ("U2408"));
       Scanner leer = new Scanner (System.in);
       int opcion = 0;       
    
        do{
            switch (opcion){
                case 1:
                    System.out.println("Universo");
                    System.out.println("Ingrese opción: ");
                    menuUniverso();
                    
                    break;
                case 2:
                    System.out.println("Escuadrón");
                    break;
                case 3:
                    System.out.println("Persona");
                    break;
                case 4:
                    break;
            }
    
        }while(opcion!=0); 
    }
    
    
    public static void menuUniverso(){
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
       int opcion1 = 0;
       do{
           System.out.println("Menú Universo\n1 - Crear\n2 - Modificar\n3 - Eliminar\n4 - Listar");
           System.out.print("Ingrese la opción: ");
           opcion1 = leer.nextInt();
           switch(opcion1){
               case 1:
                   System.out.println("Crear");
                   System.out.println("Ingrese el nombre del universo: ");
                   String nombreU = leer.next();
                   listaUniverso.add(new Universo (nombreU));
                   break;
               case 2:
                   System.out.println("Modificar");
                   
                   try{
                       System.out.print("Ingrese la posición del universo a modificar: ");
                       int pos = leer.nextInt();
                        System.out.print("Ingrese el nuevo nombre: ");
                        nombreU = leer.next();
                        listaUniverso.get(pos).setNombre(nombreU);
                   }catch(Exception e){
                       System.out.println("No hay suficientes posiciones");
                   }
                   break;
               case 3:
                   System.out.println("Eliminar");
                   try{
                       System.out.print("Ingrese la posición del universo a eliminar: ");
                       int pos = leer.nextInt();
                       listaUniverso.remove(pos);
                   }catch(Exception e){
                       System.out.println("No hay suficientes posiciones");
                   }
                   break;
               case 4:
                   System.out.println("Listar");
                   break;
           }
       }while(opcion1!=5);
    }
    
 
}
    
