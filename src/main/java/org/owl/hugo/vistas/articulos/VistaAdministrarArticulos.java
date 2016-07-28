/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas.articulos;

import org.owl.hugo.controladores.ControladorVistaAdministrarArticulos;
import org.owl.hugo.vistas.Visualizable;
import org.owl.hugo.vistas.componentes.MenuDeConsola;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.limpiarPantalla;

/**
 *
 * @author hugo
 */
public class VistaAdministrarArticulos implements Visualizable{
    private final ControladorVistaAdministrarArticulos controlador;
    
    public VistaAdministrarArticulos(ControladorVistaAdministrarArticulos controlador){
        this.controlador = controlador;
    }

   @Override
    public void visualizar() {
        limpiarPantalla();
        imprimirTituloPantalla("Administrar Articulos");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.MostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
    
}
