/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas;

import com.sun.glass.ui.delegate.MenuDelegate;
import org.owl.hugo.controladores.ControladorVistaRegistrarVentas;
import org.owl.hugo.vistas.componentes.MenuDeConsola;

/**
 *
 * @author huguito
 */
public class VistaRegistrarVentas implements Visualizable{
    private ControladorVistaRegistrarVentas controlador;

    public VistaRegistrarVentas(ControladorVistaRegistrarVentas controlador) {
        this.controlador = controlador;
    }
    
    
    @Override
    public void visualizar() {
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAccion());
        menu.MostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
}
