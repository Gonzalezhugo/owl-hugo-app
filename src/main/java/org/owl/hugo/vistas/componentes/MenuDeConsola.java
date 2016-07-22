/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas.componentes;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 *
 * Representa un menu de opciones para su utilizacion en aplicaciones de consola
 * 
 * @author hugo Gonzalez
 */
public final class MenuDeConsola {
    
    private String opciones [];
    private static final String MENSAJE_OPCION_NO_VALIDA = "\nOpción no válida. Elija una opción: ";
    
    public MenuDeConsola(String opciones[]){
        if(opciones != null && opciones.length > 0){
            this.opciones = opciones;
        } else {
            throw new IllegalStateException("Debe introducir al menos una opcion para seguir");
        }
    }
    
    /**
     * valida que la opcion sea valida, verificando que el numero sea menor que la 
     * longitud del arrays
     * @param opcion numero entero
     * @return  verdadero o falso
     */
    public boolean esOpcionValida(int opcion){
        return opcion >= 0 && opcion < opciones.length;
    }
    
    
    /**
     * solicita el ingreso de una opcion del usuario, la valida y retorna un 
     * numro valido
     * 
     * @return numero de opcion seleccionada
     */
    public int SolicitarOpcion(){
        String mensaje = "\nElija una opción: ";
        String opcionStr;
        Integer opcion = -1;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.print(mensaje);
            opcionStr = scanner.nextLine();
            try{
                opcion = new Integer(opcionStr);
                if(!esOpcionValida(opcion)){
                    mensaje = MENSAJE_OPCION_NO_VALIDA;
                }  
            }catch(NumberFormatException e){
                mensaje = MENSAJE_OPCION_NO_VALIDA;
            }
        }while(!esOpcionValida(opcion));
        
        return opcion;
    }
    
    
    /**
     * Imprimer el menu en la consola, para ser seleccionadas por el usuario
     * 
     */
    public void MostrarMenu(){
        System.out.print(this.toString());
    }
    
    
    /**
     * recorre las opciones y lo formatea a una entendible por el usuario
     * 
     * Ej.
     * [0] Opcion Cero
     * [1] Opcion uno
     * [2] Opcion Dos
     * 
     * 
     * @return una cadena que posteriormente se mostrara en consola
     */
    @Override
    public String toString(){
        StringJoiner joiner = new StringJoiner("\n");
        for(int i=0; i < opciones.length; i++){
            joiner.add("["+i+"] "+ opciones[i]);
        }
        return joiner.toString();
    }
    
   
}
