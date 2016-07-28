/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas.componentes.utilitarios;

/**
 *
 * @author huguito
 */
public class UtilitarioConsola {
    /**
     * Limpia la consola
     * Fuciona en equipos que soportan ANSI Escape Codes
     */
    public static void limpiarPantalla(){
        System.out.println("\u001B[0;0H");
        System.out.println("\u001B[2J");
    }
    
    /**
     * Imprime un texto subrayado en negrita que representa el título de pantalla
     * 
     * @param texto El titulo de pantalla
     */
    public static void imprimirTituloPantalla(String texto){
        final int offset = 6;
        StringBuffer subrayado = new StringBuffer();
        for(int i=0; i<texto.length()+offset; i++){
            subrayado.append("\u02ED");
        }
        
        System.out.println("\u001B[1m");
        System.out.println("\u001B[32m");
        System.out.println(texto);
        System.out.println("\u001B[0m");
        System.out.println("\u001B[39m");
    }
    
    public static void limpiarLinea(){
        System.out.println("\r\u001B[0k");
    }
}
