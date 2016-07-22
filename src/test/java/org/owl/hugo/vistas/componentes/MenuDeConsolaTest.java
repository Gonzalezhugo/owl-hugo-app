/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas.componentes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class MenuDeConsolaTest {
    
   public MenuDeConsolaTest(){
       
   }
   
   @org.junit.Test(expected = IllegalStateException.class)
   public void testConstructorOpcionesNulo(){
       String[] opciones = null;
       new MenuDeConsola(opciones);
   }

   @org.junit.Test(expected = IllegalStateException.class)
   public void testConstructorOpcionesVacio(){
       String[] opciones = new String[] {};
       new MenuDeConsola(opciones);
   }
   

    /**
     * Test of toString method, of class MenuDeConsola.
     */
    @org.junit.Test
    public void testToString() {
        String[] opciones = {"Opcion A", "Opcion B", "Opcion C"};
        MenuDeConsola menu = new MenuDeConsola(opciones);
        String resultadoEsperado = "[0] Opcion A\n[1] Opcion B\n[2] Opcion C";
        String menuStr = menu.toString();
        
        assertEquals(resultadoEsperado,menuStr);
    }
    
   
}
