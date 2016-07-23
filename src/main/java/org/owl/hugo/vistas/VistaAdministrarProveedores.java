/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas;

import org.owl.hugo.controladores.ControladorVistaAdministrarProveedores;
import org.owl.hugo.vistas.componentes.MenuDeConsola;

/**
 *
 * @author huguito
 */
public class VistaAdministrarProveedores implements Visualizable{
    ControladorVistaAdministrarProveedores controlador;

    public VistaAdministrarProveedores(ControladorVistaAdministrarProveedores controlador) {
        this.controlador = controlador;
    }
    
    @Override
    public void visualizar() {
        
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.MostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
    
    
}
