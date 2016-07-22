/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas;

import org.owl.hugo.controladores.ControladorVistaAdministrarArticulos;
import org.owl.hugo.vistas.componentes.MenuDeConsola;

/**
 *
 * @author hugo
 */
public class VistaAdministrarArticulos implements Visualizable{
    private ControladorVistaAdministrarArticulos controlador;
    
    public VistaAdministrarArticulos(ControladorVistaAdministrarArticulos controlador){
        this.controlador = controlador;
    }

   @Override
    public void visualizar() {
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerAcciones());
        menu.MostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
    
}
