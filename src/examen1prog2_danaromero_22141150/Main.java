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
    static ArrayList <Escuadron> listaEscuadron = new ArrayList<>();
    static ArrayList <Persona> listaPersonas = new ArrayList<>();
    static ArrayList <Persona> listaHeroes = new ArrayList<>();
    static ArrayList <Persona> listaVillanos = new ArrayList<>();
    
    public static void main(String[] args) {
       listaUniverso.add(new Universo ("U2408"));
       Scanner leer = new Scanner (System.in);
       int opcion;       
    
        do{
           System.out.println("***Menú Principal***\n1 - Universo\n2 - Escuadrón\n3 - Persona\n4 - Salir");
           System.out.print("Ingrese la opción: ");
           opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    menuUniverso();
                    break;
                case 2:
                    menuEscuadron();
                    break;
                case 3:
                    menuPersona();
                    break;
                case 4:
                    break;
            }
    
        }while(opcion!=4); 
    }
    
    
    public static void menuUniverso(){
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
       int opcion1;
       do{
           System.out.println("Menú Universo\n1 - Crear\n2 - Modificar\n3 - Eliminar\n4 - Listar");
           System.out.print("Ingrese la opción: ");
           opcion1 = leer.nextInt();
           switch(opcion1){
               case 1:
                   System.out.println("Crear");
                   System.out.print("Ingrese el nombre del universo: ");
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
                       System.out.println("La posición ingresada no existe");
                   }
                   break;
               case 3:
                   System.out.println("Eliminar");
                   try{
                       System.out.print("Ingrese la posición del universo a eliminar: ");
                       int pos = leer.nextInt();
                       listaUniverso.remove(pos);
                   }catch(Exception e){
                       System.out.println("La posición ingresada no existe");
                   }
                   break;
               case 4:
                   System.out.println("Listar");
                   for (Universo u: listaUniverso){
                       System.out.println(u.toString());
                   }
                   break;
           }
       }while(opcion1!=5);
    }
    
    public static Escuadron unicoNombreEscuadron(String nombre){
        for (Escuadron e : listaEscuadron){
            if(e.getNombre().equals(nombre)){
                return e;
            }
        }
        return null;
    }
    
    public static void menuEscuadron(){
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
       int opcion1;
       do{
           System.out.println("Menú Escuadrón\n1 - Crear\n2 - Modificar\n3 - Eliminar\n4 - Listar\n5 - Agregar Personas"
                   + "\n6 - Simular Batalla\n7 - Salir");
           System.out.print("Ingrese la opción: ");
           opcion1 = leer.nextInt();
           switch(opcion1){
               case 1:
                   System.out.println("Crear");
                   System.out.print("Ingrese el nombre del escuadrón: ");
                   String nombreE = leer.next();
                   System.out.print("Ingrese el nombre del lugar de base: ");
                   String lugar = leer.next();
                   System.out.print("1 - Héroe\n2 - Villano\nIngrese tipo: ");
                   int num = leer.nextInt();
                   Boolean tipo = (num==1);
                   if(unicoNombreEscuadron(nombreE)==null){
                       listaEscuadron.add(new Escuadron (nombreE,lugar, tipo));
                       System.out.println("Escuadrón creado exitosamente");
                   }else{
                       System.out.println("El nombre ingresado ya existe");
                   }
                   
                   break;
               case 2:
                   System.out.println("Modificar");
                   
                   try{
                       System.out.print("Ingrese la posición del universo a modificar: ");
                       int pos = leer.nextInt();
                       System.out.print("Ingrese el nombre del escuadrón: ");
                       nombreE = leer.next();
                       System.out.print("Ingrese el nombre del lugar de base: ");
                       lugar = leer.next();
                       System.out.print("1 - Héroe\n2 - Villano\nIngrese tipo: ");
                       num = leer.nextInt();
                       tipo = (num==1);
                       if(unicoNombreEscuadron(nombreE)==null){
                           listaEscuadron.get(pos).setNombre(nombreE);
                           listaEscuadron.get(pos).setLugarBase(lugar);
                           listaEscuadron.get(pos).setHeroeVillano(tipo);
                            System.out.println("Escuadrón modificado exitosamente");
                        }else{
                            System.out.println("El nombre ingresado ya existe");
                        }
                   }catch(Exception e){
                       System.out.println("La posición ingresada no existe");
                   }
                   break;
               case 3:
                   System.out.println("Eliminar");
                   try{
                       System.out.print("Ingrese la posición del escuadrón a eliminar: ");
                       int pos = leer.nextInt();
                       listaEscuadron.remove(pos);
                   }catch(Exception e){
                       System.out.println("La posición ingresada no existe");
                   }
                   break;
               case 4:
                   System.out.println("Listar");
                   for (Escuadron u: listaEscuadron){
                       System.out.println(u.toString());
                   }
                   break;
               case 5:
                   System.out.println("Agregar Personas");
                   break;
               case 6:
                   System.out.println("Simular Batalla");
                   break;
           }
       }while(opcion1!=7);
    }
    public static Persona unicoNombreHeroe(String nombre){
        for (Persona p : listaHeroes){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    public static Persona unicoNombreVillano(String nombre){
        for (Persona p : listaVillanos){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    public static Persona unicoNombrePersona(String nombre){
        for (Persona p : listaPersonas){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    public static void menuPersona(){
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
       int opcion2;
       do{
           System.out.println("Menú Persona\n1 - Crear\n2 - Modificar\n3 - Eliminar\n4 - Listar\n5 - Salir");
           System.out.print("Ingrese la opción: ");
           opcion2 = leer.nextInt();
           switch(opcion2){
               case 1:
                   System.out.println("Crear");
                   System.out.print("Ingrese el nombre: ");
                   String nombreP = leer.next();
                   System.out.print("Ingrese el poder: ");
                   String poder = leer.next();
                   System.out.print("Ingrese la debilidad: ");
                   String debilidad = leer.next();
                   System.out.print("1 - Héroe\n2 - Villano\nIngrese tipo: ");
                   int num = leer.nextInt();
                   Boolean tipoHV = (num==1);
                   System.out.print("Ingrese nivel de fuerza: ");
                   int fuerza = leer.nextInt();
                   System.out.print("Ingrese el nivel de agilidad física: ");
                   int agilidadF = leer.nextInt();
                   System.out.print("Ingrese el nivel de agilidad mental: ");
                   int agilidadM = leer.nextInt();
                   System.out.print("1 - Persona Normal\n2 - Mutante\n3 - Por Accidente Radioactivo\n4 - SuperHumano"
                           + "\n5 - Deidad\n6 - Alien\nIngrese tipo de persona: ");
                   int tipoP = leer.nextInt();
                   if(unicoNombrePersona(nombreP)==null){
                   switch(tipoP){
                       case 1:
                           if (tipoHV){
                               listaHeroes.add(new PersonaNormal (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }else{
                               listaVillanos.add(new PersonaNormal (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }
                            listaPersonas.add(new PersonaNormal (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           break;
                       case 2:
                           if (tipoHV){
                               listaHeroes.add(new Mutante (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }else{
                               listaVillanos.add(new Mutante (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }
                            listaPersonas.add(new Mutante (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));

                           break;
                       case 3:
                           //Por Accidente Radioactivo
                           System.out.print("Ingrese edad de accidente: ");
                           int edad = leer.nextInt();
                           System.out.print("Ingrese tipo de accidente: ");
                           String accidente = leer.next();
                           if (tipoHV){
                               listaHeroes.add(new PorAccidenteRadioactivo (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,edad,accidente));
                           }else{
                               listaVillanos.add(new PorAccidenteRadioactivo (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,edad,accidente));
                           }
                            listaPersonas.add(new PorAccidenteRadioactivo (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,edad,accidente));

                           break;
                       case 4:
                           //SuperHumano
                           System.out.print("Ingrese el superpoder: ");
                           String superpoder = leer.next();
                           if (tipoHV){
                               listaHeroes.add(new SuperHumano (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,superpoder));
                           }else{
                               listaVillanos.add(new SuperHumano (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,superpoder));
                           }
                            listaPersonas.add(new SuperHumano (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,superpoder));

                           break;
                       case 5:
                           //Deidad
                           System.out.print("Ingrese religión: ");
                           String religion = leer.next();
                           System.out.print("¿La religión tiene creyentes?1 - Sí\n2 - No\nSeleccione una opción: ");
                           num = leer.nextInt();
                           boolean creyentes = (num==1);
                           if (tipoHV){
                               listaHeroes.add(new Deidad (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,creyentes, religion));
                           }else{
                               listaVillanos.add(new Deidad (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,creyentes, religion));
                           }
                            listaPersonas.add(new Deidad (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,creyentes, religion));

                           break;
                       case 6:
                           //Alien
                           System.out.print("Ingrese planeta: ");
                           String planeta = leer.next();
                           if (tipoHV){
                               listaHeroes.add(new Alien (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,planeta));
                           }else{
                               listaVillanos.add(new Alien (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM, planeta));
                           }
                            listaPersonas.add(new Alien (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM, planeta));

                           break;
                           
                   }
                   System.out.println("Persona creada exitosamente");
                   }else{
                       System.out.println("El nombre ingresado ya existe"); 
                   }
                   
                   break;
               case 2:
                   System.out.println("Modificar");
                   
                   try{
                       System.out.print("Ingrese la posición del personaje a editar: ");
                       int pos = leer.nextInt();
                        System.out.print("Ingrese el nombre: ");
                        nombreP = leer.next();
                        System.out.print("Ingrese el poder: ");
                        poder = leer.next();
                        System.out.print("Ingrese la debilidad: ");
                        debilidad = leer.next();
                        System.out.print("1 - Héroe\n2 - Villano\nIngrese tipo: ");
                        num = leer.nextInt();
                        tipoHV = (num==1);
                        System.out.print("Ingrese nivel de fuerza: ");
                        fuerza = leer.nextInt();
                        System.out.print("Ingrese el nivel de agilidad física: ");
                        agilidadF = leer.nextInt();
                        System.out.print("Ingrese el nivel de agilidad mental: ");
                        agilidadM = leer.nextInt();
                        System.out.print("1 - Persona Normal\n2 - Mutante\n3 - Por Accidente Radioactivo\n4 - SuperHumano"
                                + "\n5 - Deidad\n6 - Alien\nIngrese tipo de persona: ");
                        tipoP = leer.nextInt();
                   if((unicoNombrePersona(nombreP)==null)){
                   switch(tipoP){
                       case 1:
                           if (tipoHV){
                               listaHeroes.set(pos,new PersonaNormal (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }else{
                               listaVillanos.set(pos,new PersonaNormal (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }
                           listaPersonas.set(pos,new PersonaNormal (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           break;
                       case 2:
                           if (tipoHV){
                               listaHeroes.set(pos,new Mutante (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }else{
                               listaVillanos.set(pos,new Mutante (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           }
                           listaPersonas.set(pos,new Mutante (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM));
                           break;
                       case 3:
                           //Por Accidente Radioactivo
                           System.out.print("Ingrese edad de accidente: ");
                           int edad = leer.nextInt();
                           System.out.print("Ingrese tipo de accidente: ");
                           String accidente = leer.next();
                           if (tipoHV){
                               listaHeroes.set(pos,new PorAccidenteRadioactivo (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,edad,accidente));
                           }else{
                               listaVillanos.set(pos,new PorAccidenteRadioactivo (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,edad,accidente));
                           }
                           listaPersonas.set(pos,new PorAccidenteRadioactivo (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,edad,accidente));
                           break;
                       case 4:
                           //SuperHumano
                           System.out.print("Ingrese el superpoder: ");
                           String superpoder = leer.next();
                           if (tipoHV){
                               listaHeroes.set(pos,new SuperHumano (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,superpoder));
                           }else{
                               listaVillanos.set(pos,new SuperHumano (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,superpoder));
                           }
                           listaPersonas.set(pos,new SuperHumano (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,superpoder));
                           break;
                       case 5:
                           //Deidad
                           System.out.print("Ingrese religión: ");
                           String religion = leer.next();
                           System.out.print("¿La religión tiene creyentes?1 - Sí\n2 - No\nSeleccione una opción: ");
                           num = leer.nextInt();
                           boolean creyentes = (num==1);
                           if (tipoHV){
                               listaHeroes.set(pos,new Deidad (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,creyentes, religion));
                           }else{
                               listaVillanos.set(pos,new Deidad (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,creyentes, religion));
                           }
                           listaPersonas.set(pos,new Deidad (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,creyentes, religion));
                           break;
                       case 6:
                           //Alien
                           System.out.print("Ingrese planeta: ");
                           String planeta = leer.next();
                           if (tipoHV){
                               listaHeroes.set(pos,new Alien (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM,planeta));
                           }else{
                               listaVillanos.set(pos,new Alien (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM, planeta));
                           }
                           listaPersonas.set(pos,new Alien (nombreP, poder,debilidad,tipoHV,fuerza,agilidadF,agilidadM, planeta));
                           break;
                   }
                       System.out.println("Persona modificada exitosamente");
                   }else{
                       System.out.println("El nombre ingresado ya existe"); 
                   }
                       
                   }catch(Exception e){
                       System.out.println("La posición ingresada no existe");
                   }
                   break;
               case 3:
                   System.out.println("Eliminar");
                   try{
                       System.out.print("Ingrese la posición de la persona a eliminar: ");
                       int pos = leer.nextInt();
                       listaPersonas.remove(pos);
                       System.out.println("Persona eliminada exitosamente");
                   }catch(Exception e){
                       System.out.println("La posición ingresada no existe");
                   }
                   break;
               case 4:
                   System.out.println("Listar");
                   for (Persona p: listaPersonas){
                       System.out.println(p.toString());
                   }
                   break;
           }
       }while(opcion2!=5);
    }
    
 
}
    
