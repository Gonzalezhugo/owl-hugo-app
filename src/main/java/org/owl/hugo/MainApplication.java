/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo;

import org.owl.hugo.controladores.ControladorVistaPrincipal;
import org.owl.hugo.vistas.VistaPrincipal;

/**
 *
 * @author hugo
 */
public class MainApplication {
    
    public static void main (String[] args){
        ControladorVistaPrincipal controladorPrincipal = new ControladorVistaPrincipal();
        VistaPrincipal vistaPrincipal = new VistaPrincipal(controladorPrincipal);
        vistaPrincipal.visualizar();
        
    }
}
